import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by anshu on 29/06/17.
 */


  class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
  };

public class CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node==null)
            return null;
        UndirectedGraphNode n = new UndirectedGraphNode(node.label);
        Queue<UndirectedGraphNode> q1 = new LinkedList<>();
        Queue<UndirectedGraphNode> q2 = new LinkedList<>();
        q1.add(node);
        q2.add(n);
        List<UndirectedGraphNode> visited1 = new ArrayList<>();
        List<UndirectedGraphNode> visited2 = new ArrayList<>();
        visited1.add(node);
        visited2.add(n);


        while(!q1.isEmpty()){
            UndirectedGraphNode cur = q1.poll();
            UndirectedGraphNode cur2 = q2.poll();
            for(int i=0;i<cur.neighbors.size();i++){
                UndirectedGraphNode neighbor = cur.neighbors.get(i);
                // UndirectedGraphNode nn =
                if(!visited1.contains(neighbor))
                {
                    UndirectedGraphNode nn = new UndirectedGraphNode(neighbor.label);
                    cur2.neighbors.add(nn);
                    q1.add(neighbor);
                    q2.add(cur2.neighbors.get(i));
                    visited1.add(neighbor);
                    visited2.add(nn);
                }
                else
                // {   UndirectedGraphNode x = cur2.neighbors.get(i);
                {
                    int x =0;
                    //
                    for(UndirectedGraphNode p: visited1){
                        if(p.label==neighbor.label)
                            break;
                        x++;
                    }
                    UndirectedGraphNode nn = visited2.get(x);
                    cur2.neighbors.add(nn);
                }
            }
        }

        return n;
    }
}
