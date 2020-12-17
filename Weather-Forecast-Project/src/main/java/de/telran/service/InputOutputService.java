package de.telran.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputService {

    public String readInputCityName() throws IOException {
        System.out.println("Please, enter the city");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = reader.readLine();
        return value;
    }

    public static void print(String value) {
        System.out.println(value);
    }
}
