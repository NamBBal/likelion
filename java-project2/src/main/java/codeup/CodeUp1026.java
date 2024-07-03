package codeup;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] strArr = sc.nextLine().split(":");
        int minute = Integer.parseInt(strArr[1]);
        System.out.printf("%s",minute);
    }
}
