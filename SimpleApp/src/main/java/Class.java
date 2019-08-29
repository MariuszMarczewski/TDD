import javax.swing.text.TabableView;
import java.math.MathContext;
import java.util.Scanner;

public class Class {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        int i = 1;

//        while (i < 3) {

//             int i = 1;
//
//
//            System.out.println("podaj nazwe produktu: ");
//
//            String nazwaProduktu = in.nextLine();
//
//            System.out.println("Dodałem do koszyka " + nazwaProduktu + "To jest produkt nr: " + i);
//            i++;
//
//
//        }


//        while (i < 5) {
//
//            int liczba = in.nextInt();
//
//            int sum = 0;
//
//            System.out.println("podaj dowolną liczbę: " + liczba);
//
//            i++;
//
//            suma = li
//
//
//            System.out.println("suma wartosci podanych liczb to: " + sum);
//
//
//        }


//        System.out.println("podaj liczbę nr 1: ");
//
//        tab[0] = in.nextInt();
//
//        System.out.println("podaj liczbę nr 2: ");
//
//        tab[1] = in.nextInt();
//
//        System.out.println("podaj liczbę nr 3: ");
//
//        tab[2] = in.nextInt();
//            System.out.println("podaj liczbę nr 4: ");
//
//        tab[3] = in.nextInt();
//
//        for(i=0; i<4; i++){

//
//
//        int min = tab[0];
//        int max = tab[0];
//        int sum = 0;
//
//
//        for (int number : tab) {
//
//            System.out.println("current number: " + number);
//            if (number < min) {
//                min = number;
//            }
//
//
//            if (number > max) {
//                max = number;
//            }
//
//            sum += number;
//        }
//        System.out.println("min: " + min);
//
//        System.out.println("max: " + max);
//
//        System.out.println("suma: " + sum);
//
//        System.out.println("srednia: " + 1.0 * sum / tab.length);
//    }


//        int[][] tab2d = {
//                {1, 0, 0},
//                {0, 1, 0},
//                {0, 0, 1}
//        };
//
//
//        for(int i = 0, i<tab2d.length; i++){
//            for(int j = 0; j<tab2d.length(i); j++);{
//                System.out.println(tab2d[i][j] + " ");
//            }
//
//            System.out.print("\n");
//        }


        System.out.println("Podaj znak: ");

        String s = in.nextLine();



        System.out.println("Podaj szerokość: ");

        int w = Integer.valueOf(in.nextLine());



        System.out.println("Podaj wysokość ");

        int h = Integer.valueOf(in.nextLine());



        for (int i = 0; i < h; i++) {

            for (int j = 0; j < w; j++) {

                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {

                    System.out.print(s);

                } else {

                    System.out.print(" ");

                }

            }

            System.out.print("\n");
        }
    }
}



