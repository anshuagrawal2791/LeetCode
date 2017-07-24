import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anshu on 24/07/17.
 */
public class MinimumHeightTree {
    public class Solution {
        class Graph{
            int V;
            LinkedList<Integer>[] edges;
            public Graph(int n){
                V=n;
                edges = new LinkedList[V];
                for(int i=0;i<n;i++)
                    edges[i]=new LinkedList<Integer>();
            }
            public void addEdge(int u,int v){
                edges[u].add(v);
                edges[v].add(u);
            }
            public ArrayList<Integer> getNode2(){
                ArrayList<Integer> leaves = new ArrayList<>();
                for(int i=0;i<V;i++){
                    if(edges[i].size()==1)
                        leaves.add(i);
                }
                int n = V;
                // System.out.println(leaves.toString());
                while(n>2){
                    n-=leaves.size();
                    ArrayList<Integer> newleaves = new ArrayList<>();
                    for(int i=0;i<leaves.size();i++){
                        int cur = leaves.get(i);
                        int neighbor = edges[cur].get(0);
                        edges[neighbor].remove(edges[neighbor].indexOf(cur));
                        if(edges[neighbor].size()==1)
                            newleaves.add(neighbor);
                    }
                    // n=newleaves.size();
                    leaves = newleaves;
                    // System.out.println("--"+newleaves.toString());
                    // n=V-leaves.size();
                }
                return leaves;
            }
//         public HashSet<Integer> getNode(){
//             int dist[] = new int[V];
//             boolean visited[] = new boolean[V];
//             dist[0]=0;
//             Queue<Integer> q = new LinkedList<>();
//             q.add(0);
//             visited[0]=true;
//             int max=0;
//             int max_node=0;
//             while(!q.isEmpty()){
//                 int cur = q.poll();
//                 for(int i=0;i<edges[cur].size();i++){
//                     int neighbor = edges[cur].get(i);
//                     if(!visited[neighbor]){
//                         dist[neighbor]=dist[cur]+1;
//                         visited[neighbor]=true;
//                         if(dist[neighbor]>max){
//                             max=dist[neighbor];
//                             max_node=neighbor;
//                         }
//                         q.add(neighbor);
//                     }
//                 }
//             }

//             Arrays.fill(dist,0);
//             Arrays.fill(visited,false);
//             dist[max_node]=0;
//             visited[max_node]=true;
//             q.add(max_node);
//             max=0;
//             while(!q.isEmpty()){
//                 int cur = q.poll();
//                 for(int i=0;i<edges[cur].size();i++){
//                     int neighbor = edges[cur].get(i);
//                     if(!visited[neighbor]){
//                         dist[neighbor]=dist[cur]+1;
//                         visited[neighbor]=true;
//                         if(dist[neighbor]>max){
//                             max = dist[neighbor];
//                         }
//                         q.add(neighbor);
//                     }
//                 }
//             }
//             // return max;
//             HashSet<Integer> res = new HashSet<>();
//             for(int i=0;i<V;i++){
//                 if(dist[i]==max/2||dist[i]==(max+1)/2)
//                     res.add(i);
//             }
//             return res;


//         }

        }


        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            if(n==1){
                ArrayList<Integer> li = new ArrayList<>();
                li.add(0);
                return li;
            }
            Graph g = new Graph(n);
            for(int i=0;i<edges.length;i++){
                int first = edges[i][0];
                int sec = edges[i][1];
                g.addEdge(first,sec);
            }
            // int dia = g.getDia();
            return (g.getNode2());
        }
    }
}
