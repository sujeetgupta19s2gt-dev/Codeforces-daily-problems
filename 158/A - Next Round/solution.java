import java.util.*;
public class nextround{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] arrey = new int[n];
        for(int i=0; i<n; i++){
            arrey[i] = sc.nextInt();
        }
        k--;
        for(int j=0; j<n; j++){
            if(arrey[j] >= arrey[k] && arrey[j]>0){
                count++;
            }
        }
        System.out.print(count);
    }
}