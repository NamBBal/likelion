package codeup;

import java.util.Scanner;

public class CodeUp1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.println(val1==1 ^ val2==1 ? 1 : 0 );
        //boolean result = val1 != val2;
        //System.out.printf("%d\n",result ? 1 : 0)
    }
}
