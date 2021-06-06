package calculator.newcalculator;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) { // public, private, protected,
        ActionForArabic action = new ActionForArabic();
        ActionForRoman actionForRoman = new ActionForRoman();
        for (; ; ) {
            String s1 = scan.nextLine();
            if (s1.matches("[0-9].[0-9]")) {
                if (s1.contains("+")) {
                    System.out.println(action.addArabic(s1));
                    continue;
                }
                if (s1.contains("-")) {
                    System.out.println(action.subArabic(s1));
                    continue;
                }
                if (s1.contains("*")) {
                    System.out.println(action.mulArabic(s1));
                    continue;
                }
                if (s1.contains("/")) {
                    System.out.println(action.divArabic(s1));
                }

            } else if (s1.matches("[I\\+V\\+X\\+C\\+L\\+]{1,4}[-+*/][I\\+V\\+X\\+C\\+L\\+]{1,4}+")) {
                if (s1.contains("+")) {
                    System.out.println(actionForRoman.add(s1));
                    continue;
                }
                if (s1.contains("-")) {
                    System.out.println(actionForRoman.sub(s1));
                    continue;
                }
                if (s1.contains("*")) {
                    System.out.println(actionForRoman.mul(s1));
                    continue;
                }
                if (s1.contains("/")) {
                    System.out.println(actionForRoman.div(s1));
                }
            } else {
                System.out.println("Ошибка ");
                System.exit(0);
            }
        }
    }


}
