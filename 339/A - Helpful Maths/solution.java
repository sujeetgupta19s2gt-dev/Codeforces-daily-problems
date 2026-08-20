import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int ones=0, twos=0, threes=0;
        for(int i=0; i<l; i++){
            char ch = s.charAt(i);
            if(ch=='1'){
                ones++;
            }else if(ch=='2'){
                twos++;
            }else if(ch=='3'){
                threes++;
            }
        }
        twos = ones + twos;
        threes = twos + threes;
        int n = threes;
        for(int i=1; i<=n; i++){
            if(i!=1){
                System.out.print("+");
            }
            if(i<=ones){
                System.out.print("1");
            }else if(i<=twos){
                System.out.print("2");
            }else if(i<=threes){
                System.out.print("3");
            }
        }
    }
}