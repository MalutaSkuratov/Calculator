package calculator.newcalculator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNum {
    private static HashMap<String, Integer> map = new HashMap<>();

    static {
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XI", 11);
        map.put("XII", 12);
        map.put("XIII", 13);
        map.put("XIV", 14);
        map.put("XV", 15);
        map.put("XVI", 16);
        map.put("XVII", 17);
        map.put("XVIII", 18);
        map.put("XIX", 19);
        map.put("XX", 20);
    }

    public static String romanNumerals(int Int) {
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);
        String res = "";
        for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
            int matches = Int / entry.getValue();
            res += repeat(entry.getKey(), matches);
            Int = Int % entry.getValue();
        }
        return res;
    }

    private static String repeat(String s, int n) {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static Integer parseRomanToInt(String str) {
        return map.get(str);
    }

    public static boolean hasRoman(String s1) {
            if (s1.contains("+")) {
                String[] str = s1.split("\\+");
                parseRomanToInt(str[0]);
                parseRomanToInt(str[1]);
                return true;

            } else if (s1.contains("-")) {
                String[] str = s1.split("\\-");
                parseRomanToInt(str[0]);
                parseRomanToInt(str[1]);
                return true;
            } else if (s1.contains("*")) {
                String[] str = s1.split("\\*");
                parseRomanToInt(str[0]);
                parseRomanToInt(str[1]);
                return true;
            } else if (s1.contains("/")){
                    String[] str = s1.split("/");
                    parseRomanToInt(str[0]);
                    parseRomanToInt(str[1]);
                    return true;
            }
        return false;
    }
}

