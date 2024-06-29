// Given n random integers, print the distinct (unique) integers in sorted order.

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int n = s.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        HashSet<Integer> h = new HashSet<>();
        System.out.println("Enter the values: ");
        for(int i = 0; i < n; i++) {
            int temp = s.nextInt();
            if(!h.contains(temp)) {
                q.add(temp);
                h.add(temp);
            }
        }
        while(!q.isEmpty()) System.out.print(q.poll()+" ");
    }
}
