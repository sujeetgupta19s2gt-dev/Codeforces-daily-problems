import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String target = "codeforces";
 
        while (t-- > 0) {
            char c = scanner.next().charAt(0);
            if (target.indexOf(c) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        scanner.close();
    }
}