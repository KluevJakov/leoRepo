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
        //внутри класса можно обращаться к полям этого класса напрямую, а не через сеттер
        balance += value; //добавь в метод проверку на ввод отрицательных значений
    }

    @Override
    public void withdraw(int value) {
        if (value <= getBalance()){
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
