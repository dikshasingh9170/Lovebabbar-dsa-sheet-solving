import java.util.*;
public class Arrays_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("kth max element is: "+arr[n-k]);
        System.out.println("kth min element is: "+arr[k-1]);
    }
}

