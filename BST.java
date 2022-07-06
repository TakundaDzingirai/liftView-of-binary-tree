import java.util.ArrayList;
import java.util.LinkedList;

public class BST<T extends Comparable<T>> {
    static int max_level = 0;
    private Node<T> root;
    ArrayList<T> list = new ArrayList<T>();

    public BST() {
        root = null;
    }

    public void insert(T d) {
        if (root == null) {
            root = new Node<T>(d);
        } else {
            insert(root, d);
        }
    }

    private void insert(Node<T> node, T d) {
        if (d.compareTo(node.data) <= 0) {
            if (node.left == null)
                node.left = new Node<T>(d);
            else
                insert(node.left, d);
        } else {
            if (node.right == null)
                node.right = new Node<T>(d);
            else
                insert(node.right, d);
        }
    }


    public Node<T> search(T d) {

        return search(root, d);
    }

    private Node<T> search(Node<T> node, T d) {
        if (node == null) {
            return null;
        }
        if (d.compareTo(node.data) < 0) {
            return search(node.left, d);
        } else if (d.compareTo(node.data) > 0) {
            return search(node.right, d);

        } else {
            return node;
        }

    }

    public void leftView() {
        max_level = -1;
        leftView(root, 0);
    }

    private void leftView(Node<T> node, int i) {

        if (node == null) {

            return;

        }
        if (max_level < i) {
            list.add(node.data);
            max_level = i;
        }

        leftView(node.right, i + 1);
        leftView(node.left, i + 1);


    }

    public void print() {
        for (T el : list) {
            System.out.println(el);
        }
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node<T> node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    public void BFS(Node<T> n) {
        LinkedList<Node<T>> queue = new LinkedList<Node<T>>();
        queue.add(n);
        while (!queue.isEmpty()) {
            Node<T> current = queue.poll();//removes first item
            System.out.println(current.data);
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public Node<T> getRoot() {
        return root;
    }

    public void LeftviewBFS() {
        int lvl =-1;
        max_level =-1;
        LinkedList<Node<T>> queue = new LinkedList<Node<T>>();
        queue.add(root);
        lvl++;

        while (!queue.isEmpty()) {
            Node<T> current = queue.poll();//take out first item from queue
            if (max_level<lvl){
            System.out.println(current.data);
            max_level=lvl;
            }
            if(current.right != null&&current.left != null){
                queue.add(current.left);
                queue.add(current.right);
                lvl++;
            }
            else {
                if (current.left != null) {
                    queue.add(current.left);
                    lvl++;
                } else {
                    if (current.right != null) {
                        queue.add(current.right);
                        lvl++;
                    }
                }
            }
        }

    }
}
