import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] coins = {100,20,10,5,1};
        for (int c : coins) {
            ans += n / c;
            n %= c;
        }
        System.out.println(ans);
    }
}