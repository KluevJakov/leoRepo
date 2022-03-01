package com.leojar;

import com.leojar.bankAccount.Account;
import com.leojar.bankAccount.CreditAccount;
import com.leojar.bankAccount.DebetAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account Leo = new CreditAccount(0,10); //теперь мы можем объявлять наши объекты вот так
        Account Leo2 = new DebetAccount(0, 2); //через общий интерфейс

        System.out.println("Введите сумму для пополнения");
        int num = sc.nextInt();

        Leo.deposit(num);
        Leo.show();

        int choise;
        System.out.println("Хотите ли вы выести средства? 1-да 2-нет");
        choise = sc.nextInt();
        if(choise == 1){
            System.out.println("Введите сумму для вывода");
            num = sc.nextInt();
            Leo.withdraw(num);
            Leo.show();
        } else {
            System.out.println("Балабол");
        }

        System.out.println("Введите сумму для ввода");
        num = sc.nextInt();
        Leo2.deposit(num);
        Leo2.show();
        System.out.println("Хотите ли вы выести средства? 1-да 2-нет");
        choise = sc.nextInt();
        if(choise == 1){
            System.out.println("Введите сумму для вывода");
            num = sc.nextInt();
            Leo2.withdraw(num);
            Leo2.show();
        } else {
            System.out.println("Балабол");
        }
    }
}
