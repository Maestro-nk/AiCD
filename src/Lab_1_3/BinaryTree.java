package Lab_1_3;

public class BinaryTree {

    private static class TreeNode {
        Student student;
        TreeNode left;
        TreeNode right;

        TreeNode(Student student) {
            this.student = student;
        }
    }

    private static class QueueNode {
        TreeNode treeNode;
        QueueNode next;
        QueueNode(TreeNode treeNode) { this.treeNode = treeNode; }
    }

    private static class CustomQueue {
        QueueNode head, tail;

        void enqueue(TreeNode node) {
            QueueNode newNode = new QueueNode(node);
            if (tail != null) tail.next = newNode;
            tail = newNode;
            if (head == null) head = tail;
        }

        TreeNode dequeue() {
            if (head == null) return null;
            TreeNode temp = head.treeNode;
            head = head.next;
            if (head == null) tail = null;
            return temp;
        }

        boolean isEmpty() { return head == null; }
    }

    private TreeNode root;

    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private TreeNode insertRec(TreeNode root, Student student) {
        if (root == null) {
            return new TreeNode(student);
        }

        if (student.ticketNumber < root.student.ticketNumber) {
            root.left = insertRec(root.left, student);
        } else if (student.ticketNumber > root.student.ticketNumber) {
            root.right = insertRec(root.right, student);
        } else {
            System.out.println("Помилка: Студент з квитком " + student.ticketNumber + " вже існує!");
        }
        return root;
    }

    public void printBreadthFirst() {
        if (root == null) {
            System.out.println("Дерево порожнє.");
            return;
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("| Прізвище        | Ім'я       | Курс | Квиток     | Служба в армії |");
        System.out.println("-----------------------------------------------------------------------");

        CustomQueue queue = new CustomQueue();
        queue.enqueue(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.dequeue();
            System.out.println(current.student);

            if (current.left != null) {
                queue.enqueue(current.left);
            }
            if (current.right != null) {
                queue.enqueue(current.right);
            }
        }
        System.out.println("-----------------------------------------------------------------------");
    }
}