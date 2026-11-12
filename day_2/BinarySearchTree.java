
import java.util.Scanner;

public class BinarySearchTree {

    // Node class
    static class BSTNode {
        int data;
        BSTNode left, right;

        BSTNode(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    BSTNode root = null;

    // Insert Node
    void insert(int value) {
        root = insertNode(root, value);
    }

    BSTNode insertNode(BSTNode root, int value) {

        if (root == null) {
            return new BSTNode(value);
        }

        if (value < root.data) {
            root.left = insertNode(root.left, value);
        }
        else if (value > root.data) {
            root.right = insertNode(root.right, value);
        }

        return root;
    }

    // Search Node
    boolean search(BSTNode root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    // Inorder Traversal
    void inorder(BSTNode root) {

        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal
    void preorder(BSTNode root) {

        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal
    void postorder(BSTNode root) {

        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            bst.insert(value);
        }

        System.out.println("\nINORDER:");
        bst.inorder(bst.root);

        System.out.println("\n\nPREORDER:");
        bst.preorder(bst.root);

        System.out.println("\n\nPOSTORDER:");
        bst.postorder(bst.root);

        System.out.println("\n\nEnter value to search:");
        int key = sc.nextInt();

        if (bst.search(bst.root, key)) {
            System.out.println(key + " found in BST");
        }
        else {
            System.out.println(key + " not found in BST");
        }

        sc.close();
    }
}
