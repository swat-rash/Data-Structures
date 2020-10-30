package problems.Trees;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDepthBinaryTreeTest {

    MinimumDepthBinaryTree minimumDepthBinaryTree = new MinimumDepthBinaryTree();

    @Test
    public void testMinimumDepthBinaryTree(){
        TreeNode root = new TreeNode(3  );
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        Assert.assertEquals(2,minimumDepthBinaryTree.minDepth(root));
    }
}
