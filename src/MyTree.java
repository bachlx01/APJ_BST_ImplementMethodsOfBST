import sun.reflect.generics.tree.Tree;

public class MyTree {
    TreeNode root;

    public MyTree() {
        root = null;
    }

    //Methods to insert
    public void insert(int value) {
        this.root = subInsert(this.root, value);
    }
    TreeNode subInsert(TreeNode root, int value) {
        if (root == null){
            root = new TreeNode(value);
            return root;
        }
        if (value > root.value) {
            root.right = subInsert(root.right, value);
        } else {
            root.left = subInsert(root.left, value);
        }
        return root;
    }
    //**************************************

    // Methods to output all of element of Tree map
    public void outString() {
        subString(root);
    }
    private void subString(TreeNode root){
        if (root != null){
            System.out.println(root.value);
            subString(root.left);
            subString(root.right);
        }
    }
    //**************************************

    // Methods to delete an element
    public void delete(int value) {
        this.root = subDelete(this.root, value);
    }
    TreeNode subDelete(TreeNode root, int value){
        if (root == null) return root;
        if (value < root.value) {
            root.left = subDelete(root.left, value);
        } else if (value > root.value) {
            root.right = subDelete(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            root.value = minValue(root.left);
            root.right = subDelete(root.right, root.value);
        }
        return root;
    }

    int minValue(TreeNode root) {
        int minValue = root.value;
        while (root.left != null){
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

}
