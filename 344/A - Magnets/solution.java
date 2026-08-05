import java.util.*;
public class easyProblem{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        String s, s1 = "";
        int count = 0;
        while(n-- >= 1){
            s = sc.next();
            if(s.equals("10") && (!(s.equals(s1)))) {
                count++;
                s1 = "10";
            }
            else if(s.equals("01") && ((!(s.equals(s1))))){
                count++;
                s1 = "01";
            }
        }
        System.out.println(count);
    }
}