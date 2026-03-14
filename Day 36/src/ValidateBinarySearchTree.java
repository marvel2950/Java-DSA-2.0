class Solution {
    private void inOrder(TreeNode root, List<Integer> traversal) {
        if(root == null) {
            return;
        }
        inOrder(root.left, traversal);
        traversal.add(root.val);
        inOrder(root.right, traversal);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> traversal = new ArrayList<>();
        inOrder(root, traversal);
        System.out.println(traversal);

        for(int i=0; i<traversal.size()-1; i++) {
            if(traversal.get(i) >= traversal.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}