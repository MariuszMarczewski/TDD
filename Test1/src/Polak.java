import interfaces.HRInterface;

import interfaces.ObywatelUE;



public class Polak extends Czlowiek implements ObywatelUE, HRInterface {

    public Polak(String name, int age) {

        super(name, age);

    }



    @Override

    public String getNarodowosc() {

        return "PL";

    }



    @Override

    public String getPassportID() {

        return "ID1";

    }



    @Override

    public int getPay() {

        return 0;

    }

    public String stuff(){
        Object object = null;
        String result = "",
        try{
            tring result = object.toString();
        }catch(Exception e){
re      }
    }

}




