package codeup;

import java.util.Scanner;

public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();
        int numA = Integer.parseInt(value, 16);
        System.out.println(Integer.toOctalString(numA));
    }
}
