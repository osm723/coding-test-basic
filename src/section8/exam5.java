package section8;

import java.util.Scanner;

public class exam5 {

    static Node root;

    private static void DFS(Node root) {
        System.out.print(root.data + " ");
        if (root.lt != null) {
            DFS(root.lt);

        }
        System.out.print(root.data + " ");
        if (root.rt != null) {
            DFS(root.rt);
        }
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }

}

