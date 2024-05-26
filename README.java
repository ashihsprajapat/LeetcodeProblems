# LeetcodeProblems
from today  solve the leetcode problems 
//import java.util.*;

public class diameter {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void perorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        perorder(root.left);
        perorder(root.right);
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int Diam(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDia = Diam(root.left);
        int rightDia = Diam(root.right);
        int leftHt = height(root.left);
        int rightHt = height(root.right);
        int selfDia = leftHt + rightHt + 1;
        return Math.max(selfDia, Math.max(leftDia, rightDia));

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        perorder(root);
        System.out.println("height" + height(root));
        System.out.println(Diam(root));
    }
}
