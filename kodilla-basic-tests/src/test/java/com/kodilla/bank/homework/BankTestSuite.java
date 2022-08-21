package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    @Test
    public void newBank(){
        CashMachine cashMachine = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{cashMachine});
        assertEquals(0,bank.totalBalance());
        assertEquals(0,bank.withdrawalCount());
        assertEquals(0,bank.incomesCount());
        assertEquals(0,bank.averageWithdrawal());
        assertEquals(0,bank.averageIncome());
    }

    @Test
    public void firstLoadBank(){
        CashMachine cashMachine = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{cashMachine});
        cashMachine.addTransaction(100);
        assertEquals(100,bank.totalBalance());
        assertEquals(0,bank.withdrawalCount());
        assertEquals(1,bank.incomesCount());
        assertEquals(0,bank.averageWithdrawal());
        assertEquals(100,bank.averageIncome());
    }

    @Test
    public void firstWithdrawalBank(){
        CashMachine cashMachine = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{cashMachine});
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        assertEquals(50,bank.totalBalance());
        assertEquals(1,bank.withdrawalCount());
        assertEquals(1,bank.incomesCount());
        assertEquals(50,bank.averageWithdrawal());
        assertEquals(100,bank.averageIncome());
    }


    @Test
    public void incorrectWithdrawalBank(){
        CashMachine cashMachine = new CashMachine();
        Bank bank = new Bank(new CashMachine[]{cashMachine});
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-500);
        assertEquals(100,bank.totalBalance());
        assertEquals(0,bank.withdrawalCount());
        assertEquals(1,bank.incomesCount());
        assertEquals(0,bank.averageWithdrawal());
        assertEquals(100,bank.averageIncome());
    }
}