import java.util.ArrayList;

public class g3_isCycleByDFS {
    public boolean dfs(int node, int parent, int vis[], ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;

        for (int adjacentNode : adj.get(node)) {
            if (vis[adjacentNode] == 0) {
                if (dfs(adjacentNode, node, vis, adj) == true) {
                    return true;
                }
            }

            // If visited and not parent -> cycle
            else if (adjacentNode != parent) {
                return true;
            }
        }
        return false;
    }

    public boolean isCycle(int V, int[][] edges) {
        // Code here

        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]); // undirected
        }

        int[] vis = new int[V]; // Step 2: Visited array

        for (int i = 0; i < V; i++) { // Step 3: Check each component
            if (vis[i] == 0) {
                if (dfs(i, -1, vis, adj) == true)
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}