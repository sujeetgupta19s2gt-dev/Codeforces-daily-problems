import java.util.*;
public class bear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        for(int i=1; i!=-1; i++){
            limak = limak*3;
            bob = bob*2;
            if(limak>bob){
                System.out.print(i);
                break;
            }
        }
    }
}