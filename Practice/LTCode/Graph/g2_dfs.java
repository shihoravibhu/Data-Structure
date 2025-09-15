import java.util.ArrayList;

public class g2_dfs {
     private void dfsBuild(int node , boolean[] vis , ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
        
        vis[node] = true;       // cuurrent node ne visited
        ls.add(node);
        
        for(Integer n : adj.get(node)){
            
            if(vis[n] == false){
                dfsBuild(n,vis,adj,ls);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int v = adj.size();
        boolean vis[] = new boolean[v+1];
        ArrayList<Integer> ls = new ArrayList<>();
        
        vis[0] = true;
        
        dfsBuild(0,vis,adj,ls);
        
        return ls;
    }
    public static void main(String[] args) {
        
    }
}
