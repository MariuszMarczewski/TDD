package pl.mmarczewski;

import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("podaj nazwe produktu: ");

        String nazwaProduktu = in.nextLine();

        int i = 0;

        while (i < 3) {

            System.out.println("Dodałem do koszyka " + nazwaProduktu + "To jest nasz produkt nr: " + i);
            i++;

        }
    }
}



