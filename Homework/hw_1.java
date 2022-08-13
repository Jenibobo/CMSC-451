package CMSC_451.Homework;

public class hw_1 {
     // Problem #1
     static int pentagonal (int n) { 
        int result = 0; 
        for (int i = 1; i <= n; i++) 
            result += 3 * i - 2; 
        return result; 
    }

    static int rec_pentagonal (int n) {
        if (n == 1)
	        return 1;
        return (rec_pentagonal(n - 1) + 3 * n - 2);
    }

    static int square (int n) { 
        int sum = 0; 
        for (int i = 1; i <= n; i++) 
            sum += 2 * i -1; 
        return sum; 
    }

    static int rec_square (int n) {
        if (n == 1)
	        return 1;
        return (rec_square(n -1 ) + 2 * n - 1);
    }

    public static void main(String[] args) {
        System.out.println(pentagonal(10));
        System.out.println(rec_pentagonal(10));
        // System.out.println(square(10));
        // System.out.println(rec_square(10));
    }
}
