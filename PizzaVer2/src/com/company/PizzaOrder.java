package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PizzaOrder {

    void sumOrder() {

        List<Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("vegetariana", 21));
        pizzas.add(new Pizza("shitmeat", 27));
        pizzas.add(new Pizza("hawajska", 23));

        Scanner in = new Scanner(System.in);

        System.out.println(" Nasza oferta: ");

        for (int i = 0; i < pizzas.size(); i++) {

            Pizza pizza = pizzas.get(i);
            System.out.println(pizza.getNazwa() + " " + "cena: "
                    + pizza.getCena());
        }

        List<Pizza> chosenPizza = new ArrayList<>();

        System.out.println("Dokonaj wyboru pizzy. W celu zakończenia zamówienia naciśnij 99.");

        int cenaZamówienia = 0;

        while (true) {
                int input = in.nextInt();
                if (input == 99) {
                    System.out.println("Zakończyłeś zamówienie. Zapraszamy ponownie.");
                    break;
                } else if (input < pizzas.size()) {
                    Pizza pizza = pizzas.get(input);
                    System.out.println("Wybrałeś pizzę: " + pizza.getNazwa());
                    chosenPizza.add(pizza);
                    cenaZamówienia += pizza.getCena();
                    System.out.println("Łączna wartość twojego zamówienia to: " + cenaZamówienia);
                } else {
                    System.out.println("Dokonałeś niewłaściwego wyboru. Spróbuj ponownie");
                }

                System.out.println("Twoje wybrane pizze to: ");
                chosenPizza.forEach(pizza -> System.out.println(pizza));
                System.out.println("Łączna wartość Twojego zamówienia to: " + cenaZamówienia);
                System.out.println("_______________________");

        }
    }
}
