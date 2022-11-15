package wallet;


import io.cucumber.java8.En;
import org.junit.Assert;


public class WalletSteps implements En {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", ()  -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });


        When("I request $220", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 220);
        });

        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance", 170,  wallet.getBalance());
        });

        Then("the cash should not be possible", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Given("I have empty wallet", () -> {
          Assert.assertEquals(0,wallet.getBalance());
        });

        When("I try to deposited negative amount", () -> {
           wallet.deposit(-1);
        });

        Then("the balance should not be changed", () -> {
            Assert.assertEquals(0, wallet.getBalance());
        });



        Given("there is $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,200);
         });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0,cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("You don't have enough money in my wallet", cashSlot.getMessage());
        });


        When("I check the balance of my wallet", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.checkBalance(wallet);
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals("Your balance is $100", cashSlot.getMessage());
        });
    }
}