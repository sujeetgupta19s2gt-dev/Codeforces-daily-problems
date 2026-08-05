import java.util.*;
public class Anton{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String sWithoutA = s.replaceAll("A", "");
        int anton = n - sWithoutA.length();
        int danik = sWithoutA.length();
        if(anton > danik){
            System.out.println("Anton");
        }
        else if(danik > anton){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}