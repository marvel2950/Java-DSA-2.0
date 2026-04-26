public class Trie {
    class Node {
        Node child[] = new Node[26];
        boolean isEnd;
    }

    private Node root;

    public Trie() {
        root = new Node(); // initialise root
    }

    public void insert(String word) {
        Node node = root; // start from root

        for (char c : word.toCharArray()) {
            int i = c - 97;

            // if char doesn't exist in Trie, then add
            if (node.child[i] == null) {
                node.child[i] = new Node();
            }

            node = node.child[i]; // move to the next node
        }
        node.isEnd = true; // mark end of word
    }

    public boolean search(String word) {
        Node node = root;
        for (char c : word.toCharArray()) {
            int i = c - 97;
            if (node.child[i] == null) return false;
            node = node.child[i]; // move to the next node
        }
        return node.isEnd;
    }

    public boolean startWith(String prefix) {
        Node node = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 97;
            if (node.child[i] == null) return false;
            node = node.child[i]; // move to the next node
        }
        return true;
    }
}
