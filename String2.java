package String;
import java.util.*;
public class String2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(palindrome(s));
    }
    public static boolean palindrome(String s){   
        int l=0;int r=s.length()-1; 
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
