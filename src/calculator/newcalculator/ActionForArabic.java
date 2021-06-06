package calculator.newcalculator;

import static calculator.newcalculator.ArabicNum.parseArabicToInt;

public class ActionForArabic {
     public String addArabic(String s1) {
        String[] str = s1.split("\\+");
        int a1 = parseArabicToInt(str[0]);
        int a2 = parseArabicToInt(str[1]);
        int res = a1 + a2;
        return String.valueOf(res);
    }

    public String subArabic(String s1) {
        String[] str = s1.split("\\-");
        int a1 = parseArabicToInt(str[0]);
        int a2 = parseArabicToInt(str[1]);
        int res = a1 - a2;
        return String.valueOf(res);
    }

     public String mulArabic(String s1) {
        String[] str = s1.split("\\*");
        int a1 = parseArabicToInt(str[0]);
        int a2 = parseArabicToInt(str[1]);
        int res = a1 * a2;
        return String.valueOf(res);
    }

     public String divArabic(String s1) {
        String[] str = s1.split("\\/");
        int a1 = parseArabicToInt(str[0]);
        int a2 = parseArabicToInt(str[1]);
        int res = a1 / a2;
        return String.valueOf(res);
    }
}
