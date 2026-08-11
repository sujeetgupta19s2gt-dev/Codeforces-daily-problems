import java.util.*;
public class george{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p,q;
        int counter = 0;
        while(n-- >= 1){
            p = sc.nextInt();
            q = sc.nextInt();
            if(q-p>1){
                counter++;
            }
        }
        System.out.println(counter);
    }
}