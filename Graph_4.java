import java.util.*;
public class Graph_4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj,1,0);
        addEdge(adj,0,2);
        addEdge(adj,2,1);
        addEdge(adj,0,3);
        addEdge(adj,3,4);
        
        System.out.println(dfs(adj,v));
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,int v){
        boolean[] visited=new boolean[v+1];int neighbour=-1;
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                if(Solution(i,neighbour,adj,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean Solution(int i,int neighbour,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        visited[i]=true;
        for(int it:adj.get(i)){
            if(visited[it]==false){
                Solution(it,i,adj,visited);
            }
            else if(it!=neighbour){
                return true;
            }
        }
        return false;
    }
}