import java.util.*;
public class Arrays_7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[(i+k)%nums.length]=nums[i];
        }
        List al = Arrays.asList(ans);
        System.out.print(al.toString().replace(" ",""));
    }
}
