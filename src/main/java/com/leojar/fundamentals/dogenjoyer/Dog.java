package com.leojar.fundamentals.dogenjoyer;

class Dog {
    private String name,says;

    public Dog(String name, String says){
        this.name = name;
        this.says = says;
    }

    public Dog() {
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