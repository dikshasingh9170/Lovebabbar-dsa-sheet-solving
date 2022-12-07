import java.util.*;
public class Graph_3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,2,0);
        addEdge(adj,2,3);
        addEdge(adj,3,3);
        System.out.print(dfs(adj,v));
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj,int v){
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] visited=new boolean[v+1];
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                Solution(i,res,adj,visited);
            }
        }
        return res;
    }
    public static void Solution(int i,ArrayList<Integer> res,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        res.add(i);
        visited[i]=true;
        for(int it:adj.get(i)){
            if(visited[it]==false){
                Solution(it,res,adj,visited);
            }
        }
    }
}