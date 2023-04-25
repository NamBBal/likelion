package codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] strArr = sc.nextLine().split("\\.");
        int day = Integer.parseInt(strArr[2]);
        int month = Integer.parseInt(strArr[1]);
        int year = Integer.parseInt(strArr[0]);
        System.out.printf("%02d-%02d-%04d",day,month,year);
    }
}
