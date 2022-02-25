package com.leojar.collections;

class Dog {
    private String name,says;

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
    public static void main(String[] args) {

        String name1 = "Stas";
        String name2 = "PIVAS";
        String says1 = "PIVAS";
        String says2 = "pilk";

        Dog spot = new Dog(name1,says1);
        Dog scruffy = new Dog(name2,says2);

        System.out.println(spot);
    }
}

