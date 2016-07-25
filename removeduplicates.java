package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        int t = 1;
        int k;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE LIMIT");
        int n = s.nextInt();
        System.out.println("ENTER THE NUMBERS");
        int[] a = new int[100];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            k = a[i];
            for (int j = i + 1; j < n; j++) {
                if (k == a[j]) {
                    a[i] = 0;
                    a[j] = 0;
                }
            }

        }
        System.out.println("rdg");
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                System.out.println(a[i]);
            }


        }



    }
}
