package com.leojar.bankAccount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor //волшебство библиотеки lombok | эти 3 строчки заменяют все геттеры/сеттеры и конструктор
public class CreditAccount implements Account {

    private int balance,percent;

    @Override //аннотация говорит, что мы переопределяем метод, который взяли из интерфейса Account
    public void deposit(int value) {
        while (value < 0) {
            System.out.println("Смотри че вводишь"); //добавь в метод проверку на ввод отрицательных значений
        }
        if (value > 0){
            balance += value;
        }
    }

    @Override
    public void withdraw(int value) {
        if ((value <= balance) && (value > 0)){
            setBalance(getBalance() - value);
        } else {
            System.out.println("Балабол");
        }
    }

    @Override
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
