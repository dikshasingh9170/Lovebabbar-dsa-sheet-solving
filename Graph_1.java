import java.util.*;
public class Graph_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer> > adj=new ArrayList<ArrayList<Integer>>();
        int v=sc.nextInt();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4); 
        for(int i=0;i<adj.size();i++){
            System.out.println(i+" "+adj.get(i));
        }

    }
    public static void addEdge(ArrayList<ArrayList<Integer> > adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}