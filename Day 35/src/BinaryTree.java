import java.util.Scanner;

public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public BinaryTree() {
        root = createTree();
    }

    private Node createTree() {
        int val = sc.nextInt();

        Node nn = new Node();
        nn.val = val;

        boolean hlc = sc.nextBoolean(); // has left child
        if (hlc) {
            nn.left = createTree();
        }

        boolean hrc = sc.nextBoolean(); // has right child
        if (hrc) {
            nn.right = createTree();
        }

        return nn;
    }

    public void display() {
        display(root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }

        String s = "<--" + root.val + "-->";

        if (root.left != null) {
            s = root.left.val + s;
        } else {
            s = "." + s;
        }

        if (root.right != null) {
            s = s + root.right.val;
        } else {
            s = s + ".";
        }

        System.out.println(s);
        display(root.left);
        display(root.right);
    }

    public int max() {
        return max(root);
    }

    private int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        int lMax = max(node.left);
        int rMax = max(node.right);

        return Math.max(
                node.val,
                Math.max(
                        lMax,
                        rMax
                )
        );
    }

    public boolean find(int item) {
        return find(root, item);
    }

    private boolean find(Node root, int item) {
        if(root == null) {
            return false;
        }

        if(root.val == item) {
            return true;
        }

        boolean left = find(root.left, item);
        if(left) {
            return true;
        }

        boolean right = find(root.right, item);
        if(right) {
            return true;
        }
        return false;
    }

}





