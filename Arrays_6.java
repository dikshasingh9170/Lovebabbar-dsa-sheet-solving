import java.util.*;
public class Arrays_6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(hm.containsKey(x)){
                hm.put(x,1);
            }
            else{
                hm.put(x,1);
            }
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            if(hm.containsKey(x) && !arr.contains(x)){
                hm.put(x,2);
                arr.add(x);
            }
            else if(hm.containsKey(x) && arr.contains(x)){
                hm.put(x,hm.get(i));
                arr.add(x);
            }
            else{
                hm.put(x,1);
                arr.add(x);
            }
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            System.out.print(e.getKey()+" ");
        }
        System.out.println();
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>1){
                System.out.print(e.getKey()+" ");
            }
        }
    }
}