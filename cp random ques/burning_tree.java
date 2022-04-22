import java.util.*;

public class burning_tree {
  public static Scanner scn = new Scanner(System.in);

  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }
  static int time=0;
  public static void knodes(TreeNode root,int t,TreeNode block){
     if(root==null||root==block){
         return;
     }
     time=Math.max(t,time);
     knodes(root.left,t+1,block);
     knodes(root.right,t+1,block);
     
  }
  public static int burningTree(TreeNode root, int fireNode) {
     if(root==null){
         return -1;
     }
     if(root.val==fireNode){
         return 0;
     }
     int l=burningTree(root.left,fireNode);
     if(l!=-1){
       knodes(root,l+1,root.left); 
       return l+1;
     }
     int r=burningTree(root.right,fireNode);
     if(r!=-1){
       knodes(root,r+1,root.right);
       return r+1;
     }
     return -1;
  }

  // input_section=================================================

  public static TreeNode createTree(int[] arr, int[] IDX) {
    if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
      IDX[0]++;
      return null;
    }
    TreeNode Treenode = new TreeNode(arr[IDX[0]++]);
    Treenode.left = createTree(arr, IDX);
    Treenode.right = createTree(arr, IDX);

    return Treenode;
  }

  public static void solve() {
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = scn.nextInt();

    int[] IDX = new int[1];
    TreeNode root = createTree(arr, IDX);
    int fireNode = scn.nextInt();

    burningTree(root, fireNode);
    
    System.out.println(time);

  }

  public static void main(String[] args) {
    solve();
  }
}