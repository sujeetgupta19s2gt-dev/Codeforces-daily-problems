import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        int flag=1;
        for(int i=0; i<26; i++){
            if(freq[i]==0){
                System.out.println("NO");
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("YES");
        }
    }
}