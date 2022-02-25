package com.leojar.bankAccount;



public class Account {
    public static void main(String[] args) {
        int n = 0;
        int x = 0;

        CreditAccount Leo = new CreditAccount(n,x);
        DebetAccount Leo2 = new DebetAccount(n);
//        System.out.println(Leo);
//        Leo.deposit();
//        System.out.println(Leo);
//        Leo.withdraw();
//        System.out.println(Leo);
//        Leo.show();
        System.out.println(Leo2);
        Leo2.deposit();
        Leo2.show();

    }
}
