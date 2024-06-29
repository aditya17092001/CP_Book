// Let’s define a ‘special word’ as a lowercase alphabet followed by two consecutive digits.
// Given a string, replace all ‘special words’ of length 3 with 3 stars “***”, e.g.
// S = “line: a70 and z72 will be replaced, aa24 and a872 will not”
// should be transformed into:
// S = “line: *** and *** will be replaced, aa24 and a872 will not”.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String st = s.nextLine();
        String a[] = st.split(" ");
        for(int i = 0; i < a.length; i++) {
            if(a[i].length() == 3) {
                String str = a[i];
                if(str.charAt(0) >= 'a' && str.charAt(0) <= 'z' && str.charAt(1) >= '0' && str.charAt(1) <= '9' && str.charAt(2) >= '0' && str.charAt(2) <= '9') a[i] = "***";
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < a.length; i++) ans.append(a[i]+" ");
        System.out.println(ans);
    }
    
}