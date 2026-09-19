import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
 
            int differentDays = Math.min(a, b);
            int sameDays = (Math.max(a, b) - differentDays) / 2;
 
            System.out.println(differentDays + " " + sameDays);
        }
        scanner.close();
    }
}