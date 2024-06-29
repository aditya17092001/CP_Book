import java.util.Scanner;

public class UVa10550_CombinationLock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[4];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
        System.out.println(getTotalRotations(a));
    }

    public static int getTotalRotations(int a[]) 
    {
        int ans = 360*3;
        int start = 0;
        while(start < a.length-1)
        {
            if(a[start] > a[start+1]) ans += Math.min(Math.abs((40-a[start]+a[start+1])), Math.abs(a[start]-a[start+1]))*9;
            else if(a[start] < a[start+1]) ans += Math.min(Math.abs(a[start]-a[start+1]), Math.abs(40-a[start+1]+a[start]))*9;
            start++;
        }
        return ans;
    }
    
}

 

// INPUT:
// 0 30 0 30
// 5 35 5 35
// 0 20 0 20
// 7 27 7 27
// 0 10 0 10
// 9 19 9 19


// Output
// 1350
// 1350
// 1620
// 1620
// 1890
// 1890
