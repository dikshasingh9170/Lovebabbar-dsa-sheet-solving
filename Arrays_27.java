import java.util.*;
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Integer> hs=new HashMap<Long,Integer>();
        for(int i=0;i<a1.length;i++){
            if(hs.containsKey(a1[i])){
                hs.put(a1[i],hs.get(a1[i])+1);
            }
            else{
                hs.put(a1[i],1);
            }
        }
        for(int i=0;i<a2.length;i++){
            if(hs.containsKey(a2[i]) && hs.get(a2[i])>0){
                hs.put(a2[i],hs.get(a1[i])-1);
                continue;
            }
            else{
                return "No";
            }
        }
        return "Yes";
    }
}