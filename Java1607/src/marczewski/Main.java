package marczewski;

import marczewski.Excercise;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Excercise obj = new Excercise();

        Excercise obj1 = new Excercise();
        obj1.makeMove();

        Excercise obj2 = new Excercise();
        obj2.method3(1, 2, 4);

        Random r = new Random();

        int z = r.nextInt();
        System.out.println(z);

        System.out.println(obj.liczenie());
    }
    }

