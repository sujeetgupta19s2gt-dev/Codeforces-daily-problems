import java.util.*;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder();
        int len = Math.min(s1.length(), s2.length());
        for(int i=0; i<len; i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        System.out.println(sb);
    }
}