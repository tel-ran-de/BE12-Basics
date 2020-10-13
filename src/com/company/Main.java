package com.company;



import java.util.function.BiFunction;
import java.util.function.Function;


public class Main {

    public static void main(String[] args) {
        System.out.println("=0=====вернуть длину строки,, \"abc\"======= ");
        Function <String, Integer> f = s -> s.length();
        System.out.println(f.apply("abc"));
//
        System.out.println("=1== Учитывая целое число, верните степень целого числа: 5 -> 25==");

        Function<Integer,Integer> a = (x)-> x*x;
        System.out.println(a.apply(5));

        System.out.println("=3==Для данной строки верните ее в верхнем регистре: \"ivan\" -> \"IVAN\"===");
        Function<String, String> iva = x -> x.toUpperCase();
        System.out.println(iva.apply("ivan"));

        System.out.println("==4======Для двух строк верните сумму их длин: «abc», «de» -> 5========");
        BiFunction<String,String, Integer> sum =(x, y)->x.length()+y.length();
        System.out.println(sum.apply("abc","dr"));

        System.out.println("===8====Вернуть случайное число========");
//        Function<Integer>ran=()-> (int)(Math.random()*(10+1)-1);
//        Function<Integer>ran= -> (Math.random()*(10+1)-1);
        }
    }

