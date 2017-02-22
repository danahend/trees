
/**
 * Created by danahend on 20/02/2017.
 */
public abstract class TreeMunipulation {
    /**
     * if i get root==null so i should return 0,
     * if i get tree with only one node so i need to return 1:
     * in the return it will count 1 as the current node and will redirect to the left and right node.
     * they will be null so they will return 0.
     * actually the code will get to the line "return 1+ ... " only if we have a node in the tree.
     * @param root
     * @return
     */
    public static int getSize(NodeTree root){
        if(root==null)
            return 0;
        return 1+ getSize(root.left) + getSize(root.right);
    }

    /**
     * calculating the max depth in a tree is quit the same as getSize...
     * @param root
     * @return
     */
    public static int getMaxDepth(NodeTree root){
        if (root==null)
            return 0;
        return 1 + Math.max(getMaxDepth(root.left),getMaxDepth(root.right));
    }
}
