package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTestSuite {

    @Test
    public void newMachine(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0,cashMachine.balance());
        assertEquals(0, cashMachine.transactionsCount());
    }

    @Test
    public void firstLoad(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        assertEquals(100,cashMachine.balance());
        assertEquals(1, cashMachine.transactionsCount());
    }

    @Test
    public void firstWithdrawal(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-100);
        assertEquals(0,cashMachine.balance());
        assertEquals(2, cashMachine.transactionsCount());
    }

    @Test
    public void incorrectWithdrawal(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-1000);
        assertEquals(100,cashMachine.balance());
        assertEquals(1, cashMachine.transactionsCount());
    }




}

