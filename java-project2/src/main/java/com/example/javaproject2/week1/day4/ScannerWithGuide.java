package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerWithGuide {
    public void printWithScanner() {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 개의 숫자를 입력하세요");
        System.out.print("첫 번째 숫자 : ");
        System.out.println(sc.nextInt() + "입력 완료 :)");
        System.out.print("두 번째 숫자 : ");
        System.out.println(sc.nextInt() + "입력 완료 :)");
    }
}
