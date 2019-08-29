package com.company;

public class Main {

    public static void main(String[] args) {

       Zegarek s = Zegarek.LEGIA_WARSZAWA;



        for(Zegarek x : Zegarek.values()){

            System.out.println(x.getOpis() + x.getRok());
        }

    }
}
