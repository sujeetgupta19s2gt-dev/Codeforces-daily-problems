import java.util.*;
public class word{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strng = sc.nextLine();
        arrange(strng);
    }
    
    static void arrange(String s){
        int uppercase = 0;
        int lowercase = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                uppercase++;
            }
            else{
                lowercase++;
            }
        }
        
        if(uppercase>lowercase){
            System.out.println(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
    }
}