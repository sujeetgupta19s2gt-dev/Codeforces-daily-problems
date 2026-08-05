import java.util.*;
public class wordcaptialization{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(Character.toUpperCase(s.charAt(0))+s.substring(1));
    }
}