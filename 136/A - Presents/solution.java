import java.util.*;
public class presents{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] receiver = new int[n];
        
        for(int i=0; i<n; i++){
            int givenTo = sc.nextInt();
            receiver[givenTo -1] = i+1;
        }
        
        for(int i=0; i<n; i++){
            System.out.print(receiver[i]+" ");
        }
    }
}