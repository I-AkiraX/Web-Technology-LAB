package sessional;

import java.util.Scanner;

class WeightOfString {
    static Scanner scanner = new Scanner(System.in);

    static boolean checkIgnore(char c) {
        boolean ignore = true;
        int cInt = (int) c;
        if (cInt >= 65 && cInt <= 90) {
            ignore = false;
        }
        if (cInt == 65 || cInt == 69 || cInt == 73 || cInt == 79 || cInt == 85) {
            ignore = true;
        }
        return ignore;
    }

    static int weight(String str) {
        int weight = 0;
        for (int i = 0; i < str.length(); i++) {
            char cStr = str.charAt(i);
            if (!checkIgnore(cStr)) {
                weight += (((int) cStr) - 64);
            }
        }
        return weight;
    }

    public static void main(String[] args) {
        String str;
        System.out.print("Enter the string:  ");
        str = scanner.nextLine();
        int weightStr = weight(str.toUpperCase());
        System.out.println(
                "The weight of the string " + str + " is:  " + weightStr);
    }
}