package com.company;

public class Customer {
    private String name;
    private int age;
    private BankAccount bankAccount;

    public Customer(String name, int age, BankAccount bankAccount) {
        this.name = name;
        this.age = age;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Customer(" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bankAccount=" + bankAccount +
                ')';
    }
}
