package codeup;

import java.util.Scanner;

public class CodeUp1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        boolean whoBigger = val1>val2;
        System.out.println(val1> val2 ? val1 : val2);

    }
}
