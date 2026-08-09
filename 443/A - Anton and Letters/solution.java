import java.util.*;
public class anton{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> characterSet = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                characterSet.add(ch);
            }
        }
        System.out.println(characterSet.size());
    }
}