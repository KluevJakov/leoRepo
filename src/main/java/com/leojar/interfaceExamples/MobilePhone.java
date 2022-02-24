package com.leojar.interfaceExamples;

public class MobilePhone implements Phone {
    @Override
    public void call() {
        System.out.println("*звонок сони эриксона*");
    }
}
