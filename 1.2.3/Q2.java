// Given an integer n (n ≤ 15), print π to n digits after the decimal point (rounded).
// (e.g. for n = 2, print 3.14; for n = 4, print 3.1416; for n = 5, prints 3.14159.)
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        double ans = Math.round(((double)22 / (double)7) * Math.pow(10, n)) / Math.pow(10, n);
        System.out.println(ans); 
    }
}
