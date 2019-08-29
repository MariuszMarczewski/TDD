package com.company;

import java.util.Random;

public class ItemGenerator {

    public ShopItem randomItem() {
        ShopItem result = new ShopItem(randomName(), randomPrice());
        return result;
    }

    private double randomPrice() {
        return Math.round((double) new Random().nextDouble() * 100);
    }

    private String randomName() {
        String result = "";
        int value = new Random().nextInt(3);
        switch (value) {
            case 0:
                result = "Sok";
                break;
            case 1:
                result = "Jajka";
                break;
            case 2:
                result = "Samochod";
                break;
        }
        return result;
    }
}



