public class Pomaranczo extends Plant {

    private String smak;



    public Pomaranczo(String name) {

        super(name);

    }



    public void getTaste() {

        TASTE_TYPE result = null;

        switch (super.getKolor()) {

            case RED:

                result = TASTE_TYPE.SLODKI;

                break;

            case GREEN:

                result = TASTE_TYPE.KWASNY;

                break;

            case BLUE:

                result = TASTE_TYPE.GORZKI;

                break;

        }

        System.out.println( result);

    }

}

