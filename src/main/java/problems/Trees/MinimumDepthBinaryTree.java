package problems.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthBinaryTree {

    class Item{
        int depth;
        TreeNode treeNode;
        Item(TreeNode treeNode,int depth){
            this.treeNode = treeNode;
            this.depth = depth;
        }
    }

    public int minDepth(TreeNode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        if(root.left == null)
            return 1 + minDepth(root.right);
        if(root.right == null)
            return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left),minDepth(root.right));
    }

    public int minDepth2(TreeNode root) {
        if(root==null)
            return 0;
        Queue<Item> qitem = new LinkedList<>();
        Item firstNode = new Item(root,1);
        qitem.add(firstNode);
        while(!qitem.isEmpty()){
            System.out.print(qitem.size());
            firstNode = qitem.peek();
            qitem.remove();
            TreeNode node = firstNode.treeNode;
            int depth = firstNode.depth;

            if(node.left == null && node.right == null) {
                return depth;
            }
            if(node.left!=null){
                firstNode.depth = depth+1;
                firstNode.treeNode = node.left;
                qitem.add(firstNode);
            }

            if(node.right!=null){
                firstNode.depth = depth+1;
                firstNode.treeNode = node.right;
                qitem.add(firstNode);
            }
        }
        return 0;
    }
}
