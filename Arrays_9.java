import java.util.*;
public class Arrays_9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Minimizeheights(arr,k));
    }
    public static int Minimizeheights(int[] arr,int k){
        Arrays.sort(arr);
        int n=arr.length;
        int diff=arr[n-1]-arr[0];
        int min=0;int max=0;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)continue;

            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[0]+k,arr[i]-k);

            diff=Math.min(diff,max-min);
        }
        return diff;
    }
}