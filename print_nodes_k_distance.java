import java.util.*;

public class print_nodes_k_distance {
  public static Scanner scn = new Scanner(System.in);

  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    TreeNode(int val) {
      this.val = val;
    }
  }

  
  public static void printKLevelsDown(TreeNode node,int k,ArrayList<Integer> ans,TreeNode block){
      if(node==null||node==block||k<0){
          return;
      }
      if(k==0){
          ans.add(node.val);
          return;
      }
      printKLevelsDown(node.left,k-1,ans,block);
      printKLevelsDown(node.right,k-1,ans,block);
      
  }
  public static int dis(TreeNode node,int data,int k,ArrayList<Integer> ans){
      if(node==null){
          return -1;
      }
      if(node.val==data){
          printKLevelsDown(node,k,ans,null);
          return 1;
      }
      int ld=dis(node.left,data,k,ans);
      if(ld!=-1){
          printKLevelsDown(node,k-ld,ans,node.left);
          return ld+1;
      }
      int rd=dis(node.right,data,k,ans);
      if(rd!=-1){
          printKLevelsDown(node,k-rd,ans,node.right);
          return rd+1;
      }
      
      return -1;
  }
  public static ArrayList<Integer> distanceK(TreeNode node, int data, int k) {
    ArrayList<Integer> ans=new ArrayList<>();
    dis(node,data,k,ans);
    return ans;
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
    int target = scn.nextInt();
    int k = scn.nextInt();

    ArrayList<Integer> ans = distanceK(root, target, k);
    if (ans.size() == 0)
      System.out.println();
    for (Integer ele : ans)
      System.out.println(ele + " ");

  }

  public static void main(String[] args) {
    solve();
  }
}