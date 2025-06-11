import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        
        System.out.println("Enter number of edges: ");
        int e = sc.nextInt();
        
        int[][] g = new int[n][n];
        
        
        System.out.println("Enter edges that are connected: ");
        for(int i=0;i<e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            g[u][v] = 1;
            g[v][u] = 1;
        }
        
        
        
        System.out.print("Adjacency Matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(g[i][j]+" ");
            }System.out.println();
        }
        
        
        
    }
}
