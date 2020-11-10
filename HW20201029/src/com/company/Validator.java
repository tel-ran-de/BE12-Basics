package com.company;

import com.company.Exceptions.InvalidAgeException;
import com.company.Exceptions.InvalidIbanException;
import com.company.Exceptions.InvalidIbanLengthException;

import java.util.List;

public class Validator {

    private static void checkAge(Customer c) throws InvalidAgeException {
        if (c.getAge() < 17) {
            throw new InvalidAgeException(c.getName() + "Invalid age");
        }
    }

    private static void checkIban(Customer c) throws InvalidIbanException {
        if (!c.getBankAccount().getIban().startsWith("DE")) {
            throw new InvalidIbanException(c.getName() + "Invalid Iban");
        }
    }

    private static void checkIbanLength(Customer c) throws InvalidIbanLengthException {
        if (c.getBankAccount().getIban().length() < 16) {
            throw new InvalidIbanLengthException(c.getName() + "Invalid Iban length");
        }
    }

    private static void validateCustomer(Customer customer) {
        try {
            checkAge(customer);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkIban(customer);
        } catch (InvalidIbanException e) {
            System.out.println(e.getMessage());
        }
        try {
            checkIbanLength(customer);
        } catch (InvalidIbanLengthException e) {
            System.out.println(e.getMessage());
            }
        }

    public static void validate(List<Customer> customers) {
        for (Customer customer : customers) {
            validateCustomer(customer);
        }
    }
}
