import java.util.*;
public class problem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean opinion = true;
        while(n-- != 0){
            if(sc.nextInt()==1){
                opinion = false;
            }
        }
        System.out.println(opinion?"EASY":"HARD");
    }
}