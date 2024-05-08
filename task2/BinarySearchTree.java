package task2;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree(int... values) {
        if (values.length >= 1) {
            this.root = new Node(values[0], 1, null, null);

            for (int i = 1; i < values.length; i++) {
                root.addNode(root, values[i]);
            }
        }
    }

    public void addLeaf(int value) {
        if (root == null) root = new Node(value, 1, null, null);
        else root.addNode(root, value);
    }

    public void getNodesInfo() {
        if (root != null)
            root.depthFirstSearch(root);
    }
    private class Node {
        int value, amount;
        Node left, right;

        public Node(int value, int amount, Node left, Node right) {
            this.value = value;
            this.amount = amount;
            this.left = left;
            this.right = right;
        }

        private void addNode(Node currentRoot, int newValue) {

            if (newValue > currentRoot.value) {
                if (currentRoot.right != null) addNode(currentRoot.right, newValue);
                else currentRoot.right = new Node(newValue, 1, null, null);
            }

            else if (newValue < currentRoot.value) {
                if (currentRoot.left != null) addNode(currentRoot.left, newValue);
                else currentRoot.left = new Node(newValue, 1, null, null);
            }

            else
                currentRoot.amount += 1;
        }

        private void depthFirstSearch(Node currentRoot) {
            if (currentRoot.left != null)
                depthFirstSearch(currentRoot.left);

            System.out.println("Element " + currentRoot.value + " met " + currentRoot.amount + " times");

            if (currentRoot.right != null)
                depthFirstSearch(currentRoot.right);
        }
    }
}
