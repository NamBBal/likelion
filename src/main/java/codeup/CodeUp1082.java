package codeup;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputVal = sc.next();
            for (int i = 1; i <= 15 ; i++) {
                int hexVal = Integer.parseInt(inputVal, 16);
                System.out.printf("%s * %X = %X \n",inputVal,i,hexVal * i);

            }

        }
    }
