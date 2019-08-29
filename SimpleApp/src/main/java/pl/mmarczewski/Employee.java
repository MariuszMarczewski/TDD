package pl.mmarczewski;



public class Employee {

    private static int id = 1;

    public Employee() {
        id++;
        System.out.println("Hi, I am employee no: " + id);
    }
}




