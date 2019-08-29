public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        FiguraGenerator figuraGenerator = new FiguraGenerator();

        DetailsPrinter detailsPrinter = new DetailsPrinter();
        detailsPrinter.print(figuraGenerator.getKwadrat());
        detailsPrinter.print(figuraGenerator.getOkrag());

    }


}
