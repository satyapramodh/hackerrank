import java.util.*;

class Solution {
  public int[] solution(int[] T) {
    // max possible
    int[] result = new int[T.length-1];
    TreeNode root;
    HashMap<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();

    // dummy root
    root = map.getOrDefault(T[0], new TreeNode(T[0]));

    // generate tree
    for(int i=0; i<T.length; i++){
      TreeNode source, dest;
      if(!map.containsKey(i)){
        map.put(i,new TreeNode(i));
      }
      if(!map.containsKey(T[i])){
        map.put(T[i],new TreeNode(T[i]));
      }
      source = map.get(i);
      dest = map.get(T[i]);

      // set capital
      if (i == T[i]) {
        root = source;
        root.visited = true;
      } else {
        // set route
        source.adjacent.add(dest);
        dest.adjacent.add(source);
      }
    }

    // recurse find depths
    distance(root, result, 0);

    return result;
  }

  // calculate dist
  public void distance(TreeNode root, int[] result, int dist){
    if (dist != 0)
      result[dist - 1]++;

    for(TreeNode t : root.adjacent){
      if(!t.visited){
        t.visited = true;
        distance(t, result, dist + 1);
      }
    }
  }

  class TreeNode{
    int val;
    boolean visited;
    Set<TreeNode> adjacent;

    TreeNode(int val){
      this.val = val;
      this.visited = false;
      adjacent = new HashSet<TreeNode>();
    }
  }
}