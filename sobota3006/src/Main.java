import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Map<String, String> names = new HashMap<>();
        names.put("Marek" , "Gajkowski");
        names.put("Jacek" , "Majda");

        for (Map.Entry<String, String> person : names.entrySet()) {
            String imie = person.getKey();
            String nazwisko = person.getKey();
            System.out.println(person.getKey() + " " + person.getValue());
        }

        Map<String, Map<String, String>> people = new HashMap<>();

        Map<String, String> details1 = new HashMap<>();
        Map<String, String> details2 = new HashMap<>();

        details1.put("lastName" , "Nowacki");
        details1.put("address" , "Poznan");

        details2.put("lastName" , "Kowalski");
        details2.put("address" , "Sosnowiec");

        people.put("Jędrzej" , details1);
        people.put("Jan" , details2);

        for (Map.Entry<String, Map<String, String>> person : people.entrySet()) {
            System.out.println(person.getKey());
            for (Map.Entry<String, String> details : person.getValue().entrySet()) {
                System.out.println("\t" + details.getKey() + ": " + details.getValue());

            }

        }

    }
}