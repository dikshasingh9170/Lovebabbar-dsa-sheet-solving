import java.util.*;
public class Arrays_13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MaxsumArray(arr,n);
    }
    public static void MaxsumArray(int[] arr,int n){
        int maxsum=Integer.MIN_VALUE;int currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }

            if(currsum<0)
                currsum=0;
        }
        System.out.println(maxsum);
    }
}
