import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class g1_bfs {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v = adj.size();
        
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        
        vis[0] = true;
        q.add(0);
        
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            
            for(Integer n : adj.get(node)){
                
                if(vis[n] == false){
                    vis[n] = true;
                    q.add(n);
                }
                
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        
    }
}
