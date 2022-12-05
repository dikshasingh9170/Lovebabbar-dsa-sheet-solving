package String;
import java.util.*;
public class String1 {
        public static void reverseString(char[] s) {
           int l=0;int r=s.length-1;char temp=0;
            while(l<=r){
                temp=s[l];
                s[l]=s[r];
                s[r]=temp;
                l++;
                r--;
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();char[] s=new char[n];
            for(int i=0;i<n;i++){
                s[i]=sc.next().charAt(0);
            }
            reverseString(s);
            System.out.println(Arrays.toString(s));
        }
}
