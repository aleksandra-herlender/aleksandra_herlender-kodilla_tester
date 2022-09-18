package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int amount){
        if(amount != 0  && this.balance()+amount>=0) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = amount;
            this.transactions = newTab;
        }
    }

    public int balance(){
        int sum = 0;
        for (int transaction : this.transactions) {
            sum += transaction;
        }
        return sum;
    }

    public int transactionsCount(){
        return this.size;
    }

    public int withdrawalCount(){
        int count = 0;
        for (int transaction: this.transactions) {
            if(transaction<0) {
                count++;
            }
        }
        return count;
    }

    public int incomesCount(){
        int count = 0;
        for (int transaction: this.transactions) {
            if(transaction>0) {
                count++;
            }
        }
        return count;
    }
    public int totalWithdrawal(){
        int total = 0;
        for (int transaction : this.transactions) {
            if(transaction<0) {
                total += transaction;
            }
        }
        return -1*total;
    }
    public int totalIncome(){
        int total = 0;
        for (int transaction : this.transactions) {
            if(transaction>0) {
                total += transaction;
            }
        }
        return total;
    }

}
