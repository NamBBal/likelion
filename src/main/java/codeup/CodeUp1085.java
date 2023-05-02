package codeup;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();
        float save = (float) (h * b * c *s/8.0f/1024.0f/1024.0f);
        System.out.printf("%.1f MB",save);
    }
}
