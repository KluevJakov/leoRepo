package com.leojar.bankAccount;

import java.util.Scanner;

public class CreditAccount {

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

    public void deposit() {
        System.out.println("Введите сумму для пополнения счета");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        setBalance(getBalance() + num);
        System.out.println("Введите процентную ставку");
        int num2 = sc.nextInt();
        setPercent(num2);

    }

    public void withdraw() {
        System.out.println("Введите сумму для вывода");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= getBalance()){
            setBalance(getBalance() - num);
        } else {
            System.out.println("Балабол");
        }
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
