package codeup;

import java.util.Scanner;

public class CodeUp1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int ea = 0;
        for (int i = 0; i < red ; i++) {
            for (int j = 0; j <green ; j++) {
                for (int k = 0; k <blue ; k++) {
                    System.out.printf("%d %d %d\n", i,j,k );
                    ea += 1;

                }

            }

        }
        System.out.print(ea);

    }
}
