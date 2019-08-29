package Animals;

import Animals.Cat;
import interfaces.HRInterface;
import interfaces.ObywatelUE;

public class Pet extends Cat implements ObywatelUE, HRInterface {

    public Pet(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }



    }
}
