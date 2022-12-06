package String;
import java.util.*;
public class String3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.replaceAll(" ","");
        repeat(s);
    }
    public static void repeat(String s){   
        HashMap <Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey()+", "+"count="+e.getValue());
            }
        }
    }
}

