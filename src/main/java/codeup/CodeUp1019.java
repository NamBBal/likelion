package codeup;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split("\\.");

        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);

        System.out.printf("%d.%02d.%02d",year,month,day);
    }
}
