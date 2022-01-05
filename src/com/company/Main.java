package com.company;


import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Integer,Student> people=new TreeMap<>();
        people.put(9,new Student("Улан",20));
        people.put(6,new Student("Адилет",18));
        people.put(4,new Student("Нуриса",18));
        people.put(5,new Student("Эрмек",18));
        people.put(2,new Student("Айсулуу",18));

        for(Map.Entry iterate: people.entrySet()
        ) {
            System.out.println(iterate.getKey()+ " "+ iterate.getValue());
        }

















    }
}
