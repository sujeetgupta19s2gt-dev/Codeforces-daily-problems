import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        
        String combined = s1 + s2;
        
        char[] combinedArr = combined.toCharArray();
        char[] s3Arr = s3.toCharArray();
        
        Arrays.sort(combinedArr);
        Arrays.sort(s3Arr);
        
        if (Arrays.equals(combinedArr, s3Arr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}