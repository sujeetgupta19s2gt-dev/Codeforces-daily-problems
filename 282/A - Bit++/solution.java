import java.util.*;
public class bit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int i = 0;
        while(i<n){
            String s = sc.next();
            if(s.charAt(1)=='+'){
                x++;
            }
            //else if(s.charAt(0)=='x' && s.charAt(1)=='+'){
              //  x++;
            //}
            else{
                x--;
            }
            i++;
        }
        System.out.print(x);
    }
}