import java.util.*;
public class Arrays_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Minimumjumps(nums,n));
    }
    public static int Minimumjumps(int[] nums,int n){
        int jumps[]=new int[n];

        if(n==0 || nums[0]==0){
            return 0;
        }

        jumps[0]=0;

        for(int i=1;i<n;i++){
            jumps[i]=Integer.MAX_VALUE;
            for(int j=0;j<i;j++){
                if(i<=j+nums[j]){
                    jumps[i]=Math.min(jumps[i],jumps[j]+1);
                    break;
                }
            }
        }
        return jumps[n-1];
    }
}
