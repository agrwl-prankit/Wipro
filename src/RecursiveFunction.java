public class RecursiveFunction {

    public static void main(String[] args) {
        System.out.println(A(2,4));
    }

    private static int A(int m, int n) {
        if (m==0) return n+1;
        else if (m>0 && n==0) return A(m-1, 1);
        else if(m>0 && n>0) return A(m-1, A(m,n-1));
        return 0;
    }
}
