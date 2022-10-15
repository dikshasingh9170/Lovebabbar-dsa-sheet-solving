import java.util.*;
public class Arrays_12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=3;
        int n=3;
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]+=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++)
        System.out.print(nums1[i]+" ");
    }
}