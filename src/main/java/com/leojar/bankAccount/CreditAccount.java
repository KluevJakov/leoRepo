package com.leojar.bankAccount;

import java.util.Scanner;

public class CreditAccount implements Account {

    private int balance,percent;

    public CreditAccount(int balance, int percent){
        this.balance = balance;
        this.percent = percent;
    }

    public int getBalance() {
        return balance;
    }

    public int getPercent() {
        return percent;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int deposit(int value, int value2) {
        setBalance(getBalance() + value);
        setPercent(value2);
        return 0;
    }

    public int withdraw(int value) {
        if (value <= getBalance()){
            setBalance(getBalance() - value);
        } else {
            System.out.println("Балабол");
        }
        return 0;
    }

    public void show() {
        System.out.println("Сводка по данным на Донбассе:");
        System.out.println("Баланс: " + getBalance());
        System.out.println("Процент дяди Богдана: " + getPercent());
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "balance=" + balance +
                ", percent=" + percent +
                '}';
    }
}
