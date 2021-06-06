package calculator.newcalculator;

public class ArabicNum {
    public static Integer parseArabicToInt(String str) {
        return Integer.parseInt(str);
    }

    public static boolean hasInt(String s1) {

        if (s1.contains("+")) {
            String[] str = s1.split("\\+");
            Integer.parseInt(str[0]);
            Integer.parseInt(str[1]);
            return true;

        } else if (s1.contains("-")) {
            String[] str = s1.split("\\-");
            Integer.parseInt(str[0]);
            Integer.parseInt(str[1]);
            return true;
        } else if (s1.contains("*")) {
            String[] str = s1.split("\\*");
            Integer.parseInt(str[0]);
            Integer.parseInt(str[1]);
            return true;
        } else if (s1.contains("/")) {
            String[] str = s1.split("/");
            Integer.parseInt(str[0]);
            Integer.parseInt(str[1]);
            return true;
        } else {
            return false;
        }

    }
}

