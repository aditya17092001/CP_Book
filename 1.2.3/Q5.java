// Given the distinct and valid birthdates of n people as triples (DD, MM, YYYY), order
// them first by ascending birth months (MM), then by ascending birth dates (DD), and
// finally by ascending age.

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class BirthDate {
    int day;
    int month; 
    int year;
    BirthDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Comparator<BirthDate> comparator = new Comparator<BirthDate>() {
            @Override
            public int compare(BirthDate a, BirthDate b) {
                if (a.month != b.month) return Integer.compare(a.month, b.month);
                if (a.day != b.day) return Integer.compare(a.day, b.day);
                return Integer.compare(a.year, b.year);
            }
        };
        PriorityQueue<BirthDate> q = new PriorityQueue<>(comparator);

        System.out.print("Enter the total birth days: ");
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            int day = s.nextInt();
            int month = s.nextInt();
            int year = s.nextInt();
            q.add(new BirthDate(day, month, year));
        }
        System.out.println("Sorted date is: ");
        while(!q.isEmpty()) {
            BirthDate date = q.poll();
            System.out.println(date.day+" "+date.month+" "+date.year);
        }
    }
}
