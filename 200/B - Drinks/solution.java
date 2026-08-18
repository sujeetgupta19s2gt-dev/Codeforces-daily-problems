import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int total = n;
        while(n-- != 0){
            sum += sc.nextInt();
        }
        System.out.println(sum/total);
    }
}