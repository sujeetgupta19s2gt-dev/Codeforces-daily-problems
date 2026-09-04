import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int officers = 0;
        int untreated = 0;
 
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val > 0) {
                officers += val;
            } else {
                if (officers > 0) {
                    officers--;
                } else {
                    untreated++;
                }
            }
        }
 
        System.out.println(untreated);
        sc.close();
    }
}