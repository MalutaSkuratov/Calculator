package calculator.newcalculator;

import static calculator.newcalculator.RomanNum.parseRomanToInt;
import static calculator.newcalculator.RomanNum.romanNumerals;

public class ActionForRoman {
     public String add(String s1) {
            String[] str = s1.split("\\+");
            int a1 = parseRomanToInt(str[0]);
            int a2 = parseRomanToInt(str[1]);
            int res = a1 + a2;
            return romanNumerals(res);
    }

    public String sub(String s1) {
        String[] str = s1.split("\\-");
        int a1 = parseRomanToInt(str[0]);
        int a2 = parseRomanToInt(str[1]);
        int res = a1 - a2;
        return romanNumerals(res);
    }

     public String mul(String s1) {
        String[] str = s1.split("\\*");
        int a1 = parseRomanToInt(str[0]);
        int a2 = parseRomanToInt(str[1]);
        int res = a1 * a2;
        return romanNumerals(res);
    }

     public String div(String s1) {
        String[] str = s1.split("\\/");
        int a1 = parseRomanToInt(str[0]);
        int a2 = parseRomanToInt(str[1]);
        int res = a1 / a2;
        return romanNumerals(res);
    }
}