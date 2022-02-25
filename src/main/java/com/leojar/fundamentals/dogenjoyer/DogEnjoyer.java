package com.leojar.fundamentals.dogenjoyer;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DogEnjoyer {
    public static void main(String[] args) throws IOException {

        // Сериализация и десериализация топ в контексте JSON

        // этот объект из библиотеки jackson (подключили через pom.xml)
        ObjectMapper objectMapper = new ObjectMapper();

        // Объект -> JSON
        Dog spot = new Dog("Стас", "Дай пивас"); // создали объект
        objectMapper.writeValue(new File("dog.json"), spot); // записали в файл

        // JSON  -> Объект
        Dog dog = objectMapper.readValue(new File("dog.json"), Dog.class);
        System.out.println(dog);
    }
}

