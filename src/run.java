/**
 * Created by danahend on 20/02/2017.
 */
public class run {
    public static void main(String[] args) {
        NodeTree root = new NodeTree(5);
        root.left = new NodeTree(3);
        root.right = new NodeTree(2);
        root.left.left = new NodeTree(4);
        root.right.right = new NodeTree(7);
        root.right.right.right = new NodeTree(8);

        System.out.println("this is the size of the tree: " + TreeMunipulation.getSize(root));
        System.out.println("this is the max depth of the tree: " + TreeMunipulation.getMaxDepth(root));
    }
}
