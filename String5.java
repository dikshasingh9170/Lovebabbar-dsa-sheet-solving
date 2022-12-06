package String;
import java.util.*;
public class String5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] indices=new int[s.length()];
        for(int i=0;i<s.length();i++){
            indices[i]=sc.nextInt();
        }
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder s1 = new StringBuilder(s); 
        StringBuilder s2 = new StringBuilder(s);
        for ( int i = 0; i <indices.length; i++ ) {
            s2.setCharAt(indices[i], s1.charAt(i)); 
            
        }
        return s2.toString();
    }
}
