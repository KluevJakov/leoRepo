package com.leojar;

import com.leojar.interfaceExamples.MobilePhone;
import com.leojar.interfaceExamples.OldPhone;
import com.leojar.interfaceExamples.Phone;
import com.leojar.interfaceExamples.SmartPhone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        //comment
        Phone phone1 = new OldPhone();
        Phone phone2 = new MobilePhone();
        Phone phone3 = new SmartPhone();

        phone1.call();
        phone2.call();
        phone3.call();
    }
}
