package marczewski;

import marczewski.AbstractClass;
import marczewski.ClasInterface;

public class Excercise extends AbstractClass implements ClasInterface {


    void method1() {

        System.out.println("dobrze");
    }

    @Override
    void makeMove() {

        System.out.println("override");

    }

    @Override
    public int method3(int b, int a, int c) {
        a = 3;
        b = 6;
        c = 11;
        int i = a + b + c;
        return i;
    };

    @Override
    int liczenie() {

        int w = 4;
        int y = 6;
        int x = w + y;
        return x;
    }
}
