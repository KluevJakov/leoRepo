package com.leojar.collections;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Dog implements Serializable {
    private String name,says;

    private static final long serialVersionUID = 1L;

    public Dog(String name, String says){
        this.name = name;
        this.says = says;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public String getSays() {
        return says;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", says='" + says + '\'' +
                '}';
    }
}


public class DogEnjoyer {
    public static void main(String[] args) throws IOException{

        String name1 = "Stas";
        String name2 = "PIVAS";
        String says1 = "PIVAS";
        String says2 = "pilk";

        Dog spot = new Dog(name1,says1);
        Dog scruffy = new Dog(name2,says2);

        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Username\\Desktop\\save.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(spot);
        objectOutputStream.writeObject(scruffy);

        objectOutputStream.close();


    }
}

