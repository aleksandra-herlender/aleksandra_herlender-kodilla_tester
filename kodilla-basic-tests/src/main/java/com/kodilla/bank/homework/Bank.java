package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] machines;

    public Bank(CashMachine[] machines) {
        this.machines = machines;
    }

    public int totalBalance() {
        int balance = 0;
        for (CashMachine cashMachine : this.machines) {
            balance += cashMachine.balance();
        }
        return balance;
    }

    public int withdrawalCount() {
        int count = 0;
        for (CashMachine machine : this.machines) {
            count += machine.withdrawalCount();
        }
        return count;
    }

    public int incomesCount() {
        int count = 0;
        for (CashMachine machine : this.machines) {
            count += machine.incomesCount();
        }
        return count;
    }

    public double averageWithdrawal() {

        int count = 0;
        int sum = 0;
        for (CashMachine machine : this.machines) {
            count += machine.withdrawalCount();
            sum += machine.totalWithdrawal();
        }
        if (count != 0) {
            return 1.0 * sum / this.withdrawalCount();
        } else {
            return 0.0;
        }
    }

    public double averageIncome() {
        int count = 0;
        int sum = 0;
        for (CashMachine machine : this.machines) {
            count += machine.incomesCount();
            sum += machine.totalIncome();
        }
        if (count != 0) {
            return 1.0 * sum / this.incomesCount();
        } else {
            return 0.0;
        }
    }
}
