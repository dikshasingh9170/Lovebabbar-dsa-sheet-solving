package String;
import java.util.*;
public class String4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String goal=sc.next();
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        s=s.concat(s);
        if(s.contains(goal) && n==m){
            return true;
        }
        else{
            return false;
        }
    }
}
