import java.io.*;
import java.util.*;
 
public class PetyaString{
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        str1 = str1.toLowerCase(Locale.ROOT);
        str2 = str2.toLowerCase(Locale.ROOT);
        if(str1.compareTo(str2)==0){
            System.out.println("0");
        }else if(str1.compareTo(str2)>0){
            System.out.println("1");
        }else{
            System.out.println("-1");
        }
    }
}