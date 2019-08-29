package com.company;

class Wyjatki implements Runnable{

    String name;
    Thread t;

    public Wyjatki(String nazwa) {
        this.name = nazwa;
        t = new Thread(this, nazwa);
        t.start();
    }

    @Override
    public void run() {

        System.out.println("uruchomiono wątek potomny: " + name);
        try{
            System.out.println("uśpiono wątek potomny: " + name);
            Thread.sleep(2000);
            System.out.println("wznowiono wątek potomny: " + name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("zakończono działanie wątku potomnego: " + name);
    }
}

public class Main{

    public static void main(String[] args) {
        new Wyjatki("jeden");
        new Wyjatki("dwa");
        new Wyjatki("trzy");

        try{
            System.out.println("uspiono wątek główny");
            Thread.sleep(6000);
            System.out.println("wznowiono wątek główny");
        } catch (InterruptedException e) {
            System.out.println("przerwano wątek główny");
        }
        System.out.println("zakończono działanie wątka głównego");
    }
}
