import java.util.*;
public class Arrays_11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Duplicate(nums,n));
    }
    public static int Duplicate(int[] nums,int n){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(hs.contains(nums[i])){
                return nums[i];
            }
            else{
                hs.add(nums[i]);
            }
        }
        return -1;
    }
}