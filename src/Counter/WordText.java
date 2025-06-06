package Counter;

import java.util.Scanner;

public class WordText {
    public static void main(String[] args) {

        Counter Counter = new Counter();
        Scanner scan = new Scanner(System.in);

        String text = "";
        //int chars = 0;

        System.out.println("Här räknar vi ut hur många rader och hur mycket text som skrivits, skriv in en text och skriv stop för att räkna");
        text = scan.nextLine();

        while (!text.equalsIgnoreCase("stop")) {
//            System.out.println("Din text är : " + text);
            Counter.checkText(text);
            text = scan.nextLine();

        }
//        System.out.println("Programmet är avslutat.");


        System.out.println("Du har skrivit " + Counter.getRows() + " rader");
        System.out.println("Du har skrivit " + Counter.getTotalChars() + " tecken");


    }


}

