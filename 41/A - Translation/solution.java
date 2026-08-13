import java.util.*;
public class translation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int l1 = s.length();
        int l2 = t.length();
        boolean flag = true;
        if(l1 != l2){
            flag=false;
        }
        else{
            int i=0;
            int j=l2-1;
            while(i < l1){
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(j);
                if(ch1 != ch2){
                    flag = false;
                    break;
                }
                i++;
                j--;
                if(i>l1 || j<0){
                    break;
                }
            }
        }
        if(flag==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}