package com.leojar.bankAccount;

import java.util.Scanner;

public class DebetAccount implements Account{

    private int balance;

    public DebetAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int deposit(int value) {
        setBalance(balance + value);
        return 0;
    }

    public int withdraw(int value) {

        if (value <= balance){
            setBalance(balance - value);
        } else {
            System.out.println("Балабол");
        }
        return 0;
    }

    public void show() {
        System.out.println("Сводка по данным на Донецке:");
        System.out.println("Баланс: " + getBalance());
    }
}
