package com.leojar;

import com.leojar.bankAccount.CreditAccount;
import com.leojar.bankAccount.DebetAccount;
import com.leojar.interfaceExamples.MobilePhone;
import com.leojar.interfaceExamples.OldPhone;
import com.leojar.interfaceExamples.Phone;
import com.leojar.interfaceExamples.SmartPhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditAccount Leo = new CreditAccount(0,0);
        DebetAccount Leo2 = new DebetAccount(0);
        System.out.println("Введите сумму для пополнения");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Введите процентную ставку");
        int num2 = sc.nextInt();
        Leo.deposit(num,num2);
        Leo.show();
        int choise = 0;
        num = 0;
        num2 = 0;
        System.out.println("Хотите ли вы выести средства? 1-да 2-нет");
        choise = sc.nextInt();
        if(choise == 1){
            System.out.println("Введите сумму для вывода");
            num = sc.nextInt();
            Leo.withdraw(num);
            Leo.show();
            num = 0;
        } else {
            System.out.println("Балабол");
        }

        choise = 0;

        System.out.println("Введите сумму для ввода");
        num = sc.nextInt();
        Leo2.deposit(num);
        Leo2.show();
        System.out.println("Хотите ли вы выести средства? 1-да 2-нет");
        choise = sc.nextInt();
        if(choise == 1){
            System.out.println("Введите сумму для вывода");
            num2 = sc.nextInt();
            Leo2.withdraw(num2);
            Leo2.show();
            num2 = 0;
        } else {
            System.out.println("Балабол");
        }



    }
}
