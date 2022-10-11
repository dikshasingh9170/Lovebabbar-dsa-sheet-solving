import java.util.*;
public class Arrays_4{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];String zero="";String one="";String two="";
        for(int i=0;i<n;i++){
            char x=sc.next().charAt(0);
            if(x=='0'){
                zero+=x+" ";
            }
            else if(x=='1'){
                one+=x+" ";
            }
            else{
                if(i==n-1){
                    two+=x;
                }
                else{
                    two+=x+" ";
                }
            }
        }
        System.out.print(zero+one+two);
    }
}