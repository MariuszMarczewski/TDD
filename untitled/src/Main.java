import com.company.ItemGenerator;
import com.company.ShopItem;
import jdk.jshell.ImportSnippet;


import java.util.Scanner;

public class Main {



    static public void helloFunction(String name){
        System.out.println("Hello" + name);



        char ostatniaLitera = name.charAt(name.length() -1);
        System.out.println("Ostatnia: " + ostatniaLitera);

        String sex = plec(ostatniaLitera);

        System.out.println("Twoja plec: " + sex);

    }
    static public String plec(char lastChar){
        String result = "";

        if(lastChar == 'a'){
            result = "kobieta";
        }else{
            result = "mezczyzna";
        }
        return "";
    }

    public static void main(String[] cos) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        helloFunction(input);

        helloFunction(new Scanner(System.in).nextLine());


        ShopItem shopItem = new ShopItem("sok", 2.5);

        ItemGenerator itemGenerator = new ItemGenerator();
        itemGenerator.randomItem();


    }

}
