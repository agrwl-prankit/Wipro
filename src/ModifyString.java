import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String res = modify(inputString);
        System.out.println(res);
    }

    private static String modify(String inputString) {
        String outputString = "";
        String[] arr = inputString.split("\\s+");
        for (int i=0; i<arr.length; i++){
            String s = arr[i];
            String s1="";
            int len = s.length();
            for (int j=0; j<len; j++){
                int asc = s.charAt(j);
                if (asc>=65 && asc<=90 && asc+len > 90){
                    asc = 90;
                }
                else if (asc>=97 && asc<=122 && asc+len > 122){
                    asc = 122;
                }
                else asc += len;
                s1 += (char) asc;
            }
            arr[i] = s1;
        }
        for(int i=0; i<arr.length; i++)
            outputString += arr[i]+" ";
        outputString = outputString.trim();
        return outputString;
    }
}
