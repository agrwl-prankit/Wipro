import java.util.Arrays;
import java.util.Scanner;

public class FindKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int key = findKey(n1, n2, n3);
        System.out.println(key);
    }

    private static int findKey(int n1, int n2, int n3) {
        char s1[] = String.valueOf(n1).toCharArray();
        char s2[] = String.valueOf(n2).toCharArray();
        char s3[] = String.valueOf(n3).toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        Arrays.sort(s3);
        return  (Integer.parseInt(String.valueOf(s1[3])) + Integer.parseInt(String.valueOf(s2[3])) +
                Integer.parseInt(String.valueOf(s3[3])) + Integer.parseInt(String.valueOf(s1[0])) +
                Integer.parseInt(String.valueOf(s2[0])) + Integer.parseInt(String.valueOf(s3[0])));
    }
}
