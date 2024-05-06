public class App {
    public static void main(String[] args) throws Exception {
        TreeNode<String> root = new TreeNode<String>("A");
        root.setLeft(new TreeNode<String>("B"));
        root.setRight(new TreeNode<String>("C"));
        root.getLeft().setLeft(new TreeNode<String>("D"));
        root.getLeft().setRight(new TreeNode<String>("E"));
        root.getRight().setRight(new TreeNode<String>("F"));

        System.out.println("Preorder Traversal");
        preorder(root);

      

    }

    public static void preorder(TreeNode<String> node) {
        if (node != null) {
            // Visit the node first (pre)
            System.out.println(node.getValue());
            // Recurse left
            preorder(node.getLeft());
            // Recurse right
            preorder(node.getRight());
        }
    }
}
