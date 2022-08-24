package CMSC_451.Discussions;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
public class dis_1 {

    static long count = 0;

    static long calc_exp(long base, long n) {
        
        long ans = 0;
        for (long i = 0; i < n; i++) {
            ans += base;
            count ++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Base: ");
        long base = input.nextLong();

        System.out.println("Enter Exponent: ");
        long exp = input.nextLong(); 
        System.out.println();

        long n = 1;
        long start;
        long stop;
        long nanoSec;
        double secs;

        long total_start = System.nanoTime();

        for (int i = 1; i <= exp; i++) {
            start = System.nanoTime();
            n = calc_exp(base, n);
            System.out.println(n);

            stop = System.nanoTime();
            nanoSec = stop - start;
            secs = nanoSec / 1000000000.0;
            System.out.println(i + " iteration run time in seconds: " + secs + "\n");
            System.out.println("\nNumber of loops: " + count);
        }

        long total_stop = System.nanoTime();
        nanoSec = total_stop - total_start;
        secs = nanoSec / 1000000000.0;
        System.out.println("Total run time in seconds: " + secs);

        System.out.println("\nNumber of loops: " + count);

    }
   
}
