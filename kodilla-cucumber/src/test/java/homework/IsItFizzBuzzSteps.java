package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzzSteps implements En {
    private Integer number;
    private String result;

    public IsItFizzBuzzSteps() {
        Given("the number {int}", (Integer int1) -> {
            this.number = int1;
        });

        When("I check for FizzBuzz", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.result = FizzOrBuzz.fizzBuzz(this.number);
        });

        Then("I receive {string}", (String string) -> {
            Assert.assertEquals(string,this.result);
        });

    }
}
