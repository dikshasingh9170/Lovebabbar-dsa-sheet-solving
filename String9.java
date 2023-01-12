package String;
import java.util.*;
public class String9 {
     static ArrayList<String> al=new ArrayList<>();
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Subsequence(s,"");
        System.out.println(al);
    }
    private static void Subsequence(String s,String ans){
        if(s.length()==0){
            al.add(ans);
            return;
        }
        Subsequence(s.substring(1),ans+s.charAt(0));
        Subsequence(s.substring(1),ans);
    }
}
