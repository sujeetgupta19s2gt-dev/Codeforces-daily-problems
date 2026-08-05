import java.util.*;
public class Soilder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=w; i++){
            int multi = i*k;
            sum = sum+multi;
        }
        if(sum>n){
            int output = sum-n;
            System.out.print(output);
        }
        else{
            System.out.print("0");
        }
    }
}