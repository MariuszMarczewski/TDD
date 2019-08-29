package pl.mmarczewski;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.module.FindException;

public class Nowy {

    public static  void main (String[] args) throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("inwokacja.txt");
        zapis.println("Litwo! Ojczyzno moja! ty jesteś jak zdrowie.\n" +
                "\n" +
                "Ile cię trzeba cenić, ten tylko się dowie,\n" +
                "\n" +
                "Kto cię stracił. Dziś piękność twą w całej ozdobie\n" +
                "\n" +
                "Widzę i opisuję, bo tęsknię po tobie");
    }


}
