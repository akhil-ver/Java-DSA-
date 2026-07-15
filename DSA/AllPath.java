package Graph;
import java.util.*;
class Edge{
    int dest;
    Edge(int dest){
        this.dest=dest;
    }
}
public class AllPath {

    public static void printallPath(ArrayList<Edge> graph[] , boolean[] visited , int curr, String path , int target){

        if(curr == target){
            System.out.println(path);
            return ;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(visited[e.dest] == false){
                visited[curr] = true;
                printallPath(graph, visited, e.dest, path+e.dest, target);
                visited[curr]=false;
            }

        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Vertex : ");
        int V = sc.nextInt();
        System.out.print("Enter the number of Edges : ");
        int E = sc.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[V];
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            graph[i]= new ArrayList<>();
        }
        for(int i=0;i<E;i++){

            int src = sc.nextInt();
            int dest = sc.nextInt();

            // Validate input
            if (src < 0 || src >= V || dest < 0 || dest >= V) {
                System.out.println("Invalid vertex! Please enter values between 0 and " + (V - 1));
                i--;
                continue;
            }
            graph[src].add(new Edge(dest));
        }

        System.out.print("Enter the start Vertex : ");
        int start = sc.nextInt();

        System.out.print("Enter the target Vertex : ");
        int target = sc.nextInt();

        for(int i=0;i<V;i++){
            if(visited[i]==false){
                printallPath(graph,visited,start,String.valueOf(start),target);
            }
        }

        sc.close();
    }
}
