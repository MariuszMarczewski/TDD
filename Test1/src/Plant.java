import java.util.Random;



public class Plant {

    private String name;

    private COLORS color;



    public Plant(String name) {

        this.name = name;

    }



    public String getName() {

        return name;

    }



    public COLORS getKolor() {

        if(color != null){

            return color;

        }else {

            int pick = new Random().nextInt(COLORS.values().length);

            return COLORS.values()[pick];

        }

    }

}




