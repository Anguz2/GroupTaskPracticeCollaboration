package Daria.week1;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number:");

        num = scan.nextInt();
        Finra(num);

    }
    public static void Finra(int N) {

        for (int i = 1; i <= N; i++) {

            if (i % 5 == 0 && N % 3 == 0) {
                System.out.println("FINRA");

            } else if (i % 3 == 0) {
                System.out.println("FIN");

            } else if (i % 5 == 0) {
                System.out.println("RA");

            } else {
                System.out.println(i);
            }
        }
        System.out.print(N);
    }

}
/**
 * Write a method which prints out the numbers from 1 to 30 but for numbers which
 * are a multiple of 3print "FIN" instead of the number and for numbers which are a
 * multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
 * both 3 and 5, print "FINRA" instead of the number.
 */



