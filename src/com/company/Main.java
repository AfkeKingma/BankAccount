package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount = new BankAccount("1234", 11.23, "Kingma", "Kingma@mail.com", "0123456789");

	    double addAmount = bankAccount.addToBalance(11.25);

        System.out.println("The new balance is : " + addAmount);

        double minAmount = bankAccount.removeFromBalance(1.24);

        System.out.println("The new balance is : " + minAmount);
    }
}
