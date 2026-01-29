package com.javarush.personal;

public class BankAccount {
    private double balance = 0;

    public class Transaction {
        private double amount;

        public Transaction(double amount) {
            this.amount = amount;
        }

        public void execute() {
            BankAccount.this.balance -= this.amount;
            System.out.println("Taken: " + this.amount + ", Remaining: " + BankAccount.this.balance);
        }
    }
}
