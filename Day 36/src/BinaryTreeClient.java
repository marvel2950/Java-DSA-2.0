public class BinaryTreeClient {
    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree();
        bt.display();
        System.out.println(bt.max());
        System.out.println(bt.find(10));
        System.out.println(bt.find(100));
        System.out.println(bt.height());

        bt.preOrder();
        bt.inOrder();
        bt.postOrder();

    }

}
