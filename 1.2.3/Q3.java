// Given a date, determine the day of the week (Monday, . . . , Sunday) on that day.
// (e.g. 9 August 2010—the launch date of the first edition of this book—is a Monday.)

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        try {
            LocalDate date = LocalDate.parse(input, formatter);
            String day = date.getDayOfWeek().toString();
            System.out.println(day);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}