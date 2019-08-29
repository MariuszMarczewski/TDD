package com.company;

import java.lang.reflect.Array;
import java.util.*;



public class Main {

    public static void main(String[] args) {

        ArrayList<Samochody> fury = new ArrayList<>();

        fury.add(new Samochody("Volvo", 2010));
        fury.add(new Samochody("Audi", 2009));
        fury.add(new Samochody("Citroen", 2018));
        fury.add(new Samochody("Fiat", 2009));

//        System.out.println(fury);

        for (Samochody s : fury) {
            System.out.println(s.getMarka());
        }

//        Collections.sort(fury, (Samochody o1, Samochody o2)) -> o1.ge;

        fury.sort(Comparator.comparing(Samochody::getMarka));

        System.out.println(" ");

        for (Samochody s : fury) {
            System.out.println(s.getMarka());
        }

    }
}
