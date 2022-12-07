import java.util.*;
public class Graph_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,2,0);
        addEdge(adj,2,3);
        addEdge(adj,3,3);
        
        System.out.print(bfs(adj,v));
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj,int v){
        Queue<Integer> qt=new LinkedList<Integer>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        boolean[] visited=new boolean[v];
        qt.add(0);
        while(!qt.isEmpty()){
            int res=qt.poll();
            ans.add(res);
            visited[res]=true;
            for(int k:adj.get(res)){
                if(visited[k]==false){
                    qt.add(k);
                    visited[k]=true;
                }
            }
        }
        return ans;
    }
}