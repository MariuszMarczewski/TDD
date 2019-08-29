import animals.Animal;

import animals.Pet;

import interfaces.HRInterface;

import interfaces.UEInterface;



import java.util.ArrayList;

import java.util.List;



public class Main {





    public static void main(String[] args) {

        System.out.println("Hello World!");



        List<HRInterface> polacy = new ArrayList<>();



        Czlowiek czlowiek1 = new Czlowiek("Andrzej", 44);

        Czlowiek czlowiek2 = new Czlowiek("Grazyna", 42);

        Polak janusz = new Polak("Janusz", 50);

        Pet filemon = new Pet("Filemon", 5);





        polacy.add(janusz);

        polacy.add(new Polak("Roman", 30));

        polacy.add(filemon);



        janusz.stuff();



        try {

            janusz.stuff2();

        } catch (NullPointerException e) {

            System.out.println("mamy nulla");

        } catch (Exception e) {

            e.printStackTrace();

        }





    }

}


