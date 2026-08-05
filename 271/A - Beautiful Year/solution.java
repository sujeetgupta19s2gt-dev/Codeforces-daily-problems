import java.util.*;
public class beautiful{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(true){
            year++;
            int n = year;
            
            int a = n/1000;
            int b = (n/100)%10;
            int c = (n/10)%10;
            int d = n%10;
            
            if(a != b && a != c && a != d && b != c && b != d && c !=d){
                break;
            }
        }
        System.out.println(year);
    }
}