import java.util.LinkedList;
import java.util.Queue;
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
        if (root == null) {
            return false;
        }

        if (root.val == item) {
            return true;
        }

        boolean left = find(root.left, item);
        if (left) {
            return true;
        }

        boolean right = find(root.right, item);
        if (right) {
            return true;
        }
        return false;
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public void postOrder() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public void levelOrder() {
        levelOrder(root);
    }

    private void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node nn = queue.poll();
            System.out.print(nn.val + " ");
            if(nn.left != null) queue.add(nn.left);
            if(nn.right != null) queue.add(nn.right);
        }
        System.out.println();
    }

}
