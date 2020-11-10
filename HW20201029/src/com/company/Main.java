package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Jack", 15, new BankAccount("IT77777788889")),
                new Customer("Martin", 30, new BankAccount("IE777777")),
                new Customer("Bob", 18, new BankAccount("DE77777788889999")));

        Validator.validate(customers);
    }
}
