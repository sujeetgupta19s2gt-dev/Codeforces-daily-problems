import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        
        int totalDrink = k * l;
        int drinkToasts = totalDrink / nl;
        
        int limeToasts = c * d;
        
        int saltToasts = p / np;
        
        int minToasts = Math.min(drinkToasts, Math.min(limeToasts, saltToasts));
        
        System.out.println(minToasts / n);
        
        sc.close();
    }
}