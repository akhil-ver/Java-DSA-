package Graph;

import java.util.*;

class Edge {
    int dest;
    int weight;

    Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}

public class ImplementationOfGraph {
    public static void dfs(ArrayList<Edge> graph[] , boolean visited[] , int curr){
        System.out.print(curr+" ");
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dest] == false){
                dfs(graph,visited,e.dest);
            }
        }  
    }

    // BFS Traversal
    public static void bfs(ArrayList<Edge>[] graph, boolean[] visited, int start) {

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int curr = queue.remove();
            System.out.print(curr + " ");

            for (Edge e : graph[curr]) {
                if (!visited[e.dest]) {
                    visited[e.dest] = true;
                    queue.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter the number of edges: ");
        int E = sc.nextInt();

        // Create graph
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        System.out.println("Enter each edge (source destination weight):");

        for (int i = 0; i < E; i++) {

            int src = sc.nextInt();
            int dest = sc.nextInt();
            int weight = sc.nextInt();

            // Validate input
            if (src < 0 || src >= V || dest < 0 || dest >= V) {
                System.out.println("Invalid vertex! Please enter values between 0 and " + (V - 1));
                i--;
                continue;
            }

            // Undirected Graph
            graph[src].add(new Edge(dest, weight));
            graph[dest].add(new Edge(src, weight));

            // For Directed Graph, use only:
            // graph[src].add(new Edge(dest, weight));
        }

        // Print Adjacency List
        System.out.println("\nAdjacency List:");

        for (int i = 0; i < V; i++) {

            System.out.print(i + " -> ");

            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + ", " + e.weight + ") ");
            }

            System.out.println();
        }

        // BFS Traversal
        boolean[] visited = new boolean[V];

        System.out.println("\nBFS Traversal:");

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                bfs(graph, visited, i);
            }
        }

        System.out.println("\nDFS Traversal:");

        for(int i=0;i<V;i++){
            visited[i]=false;
        }

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(graph, visited, i);
            }
        }

        System.out.println();
        sc.close();
    }
}


/*
input 
5
6
0 1 2
0 2 4
1 3 7
2 3 1
3 4 3
1 4 5
*/