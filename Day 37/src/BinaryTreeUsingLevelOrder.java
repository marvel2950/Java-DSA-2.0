import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingLevelOrder extends BinaryTree {

    public BinaryTreeUsingLevelOrder() {
        super(true);
        root = createTree();
    }
    private Node createTree() {
        Queue<Node> queue = new LinkedList<>();

        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        queue.add(nn);
        root = nn;

        while(!queue.isEmpty()) {
            Node r = queue.poll(); // popped node

            int c1 = sc.nextInt(); // left child value
            int c2 = sc.nextInt(); // right child value

            if(c1 != -1) {
                Node node = new Node();
                node.val = c1;
                r.left = node;
                queue.add(node);
            }

            if(c2 != -1) {
                Node node = new Node();
                node.val = c2;
                r.right = node;
                queue.add(node);
            }
        }
        return root;
    }
}
