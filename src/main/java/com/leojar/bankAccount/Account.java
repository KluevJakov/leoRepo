package com.leojar.bankAccount;

//в интерфейсах просто объявляем методы, которыми обязательно должны обладать имплементирующие классы
public interface Account {
    void deposit(int value);

    void withdraw(int value);

    void show();
}
