package com.leojar.bankAccount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor //волшебство библиотеки lombok | эти 3 строчки заменяют все геттеры/сеттеры и конструктор
public class DebetAccount implements Account{

    private int balance, percent;

    @Override
    public void deposit(int value) {
        //внутри класса можно обращаться к полям этого класса напрямую, а не через сеттер
        balance += value; //добавь в метод проверку на ввод отрицательных значений
    }

    @Override
    public void withdraw(int value) {
        if (value <= balance){
            setBalance(balance - value);
        } else {
            System.out.println("Балабол");
        }
    }

    @Override
    public void show() {
        System.out.println("Сводка по данным на Донецке:");
        System.out.println("Баланс: " + getBalance());
    }
}
