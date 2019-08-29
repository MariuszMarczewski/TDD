package pl.mmarczewski;

import java.util.*;

public class NowyOdczyt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę produktów: ");

        int count = Integer.valueOf(in.nextLine());

        List<String> cart = new ArrayList<>(count);

        for(int i = 0; i < count; i++) {

            System.out.println("Podaj produkt nr " + (i + 1));

            cart.add(in.nextLine());

        }

        System.out.println("Zakupione produkty:");

        for(String item: cart) {

            System.out.println(item);

        }

        for(int i = 0; i < cart.size(); i++) {

            System.out.println(cart.get(i));

        }

        Iterator<String> cartIterator = cart.iterator();

        while(cartIterator.hasNext()) {

            System.out.println(cartIterator.next());

        }















    }