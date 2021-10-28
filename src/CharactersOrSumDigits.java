import java.util.Scanner;

public class CharactersOrSumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int n1 = sc.nextInt();
        System.out.println(findCharOrDigitSum(s1, n1));
    }

    private static String findCharOrDigitSum(String s1, int n1) {
        String res = null;
        if (s1.isEmpty()) res = "NULL";
        else if (n1==0 && noDigit(s1)) res = "ZERO";
        else if(n1==1 && noAlphabet(s1)) res = "ZERO";
        return res;
    }

    private static boolean noDigit(String s1) {
        int n;
        for(int i=0; i<s1.length(); i++){
            n = s1.charAt(i);
            if(n>=0 && n<=9) return true;
        }
        return false;
    }

    private static boolean noAlphabet(String s1) {
        int n;
        for(int i=0; i<s1.length(); i++){
            n = s1.charAt(i);
            if((n>=91 && n<=122) || (n>=65 && n<=90)) return true;
        }
        return false;
    }
}
