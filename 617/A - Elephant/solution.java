import java.util.*;
public class elephant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x-1;
        int b = x-2;
        int c = x-3;
        int d = x-4;
        int z;
        if(a%5==0){
            z=a/5;
            System.out.print(z+1);
        }
        else  if(b%5==0){
            z=b/5;
            System.out.print(z+1);
        }
        else  if(c%5==0){
            z=c/5;
            System.out.print(z+1);
        }
        else  if(d%5==0){
            z=d/5;
            System.out.print(z+1);
        }
        else{
            z=a/5;
            System.out.print(z+1);
        }
    }
}