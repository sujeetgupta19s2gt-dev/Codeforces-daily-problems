import java.util.*;
public class boysorgirls {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        Set<Character> charset = new java.util.HashSet<>();
        for(int i=0; i<s.length(); i++){
            charset.add(s.charAt(i));
        }
        if(charset.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}