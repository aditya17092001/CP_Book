import java.util.Scanner;

public class UVa11364_Parking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++) 
        {
            a[i] = s.nextInt();
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        System.out.println((max-min)*2);
    }  
}
