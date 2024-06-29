// Generate all possible permutations of {‘A’, ‘B’, ‘C’, . . . , ‘J’}, the first N = 10 letters
// in the alphabet (see Section 3.2.1).

public class Q7 {
    public static void main(String[] args) {
        Permutations("");
    }

    public static void Permutations(String asf) {
        if(asf.length() == 3) {
           System.out.println(asf);
            asf = asf.substring(0, asf.length()-1);
            return;
        }
        for(int i = 0; i < 3; i++) {
            char c = (char)('a'+i);
            if(asf.contains(c+"")) continue;
            Permutations(asf+c+"");
        }
    }
}
