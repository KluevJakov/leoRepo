package com.leojar.bankAccount;

import java.util.Scanner;

public class DebetAccount {

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


    public void deposit() {
        System.out.println("Введите сумму для пополнения счета");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        setBalance(getBalance() + num);

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
        System.out.println("Сводка по данным на Донецке:");
        System.out.println("Баланс: " + getBalance());
    }
}
