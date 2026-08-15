import java.util.*;
public class wanna{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        Set<Integer> distinctElements = new LinkedHashSet<>();
        while(p-- >= 1){
            distinctElements.add(sc.nextInt());
        }
        int q = sc.nextInt();
        while(q-- >= 1 ){
            distinctElements.add(sc.nextInt());
        }
        if(distinctElements.size() == n){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}