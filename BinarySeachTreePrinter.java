public class BinarySeachTreePrinter {

    Node root;

    class Node {
        String value;
        Node left;
        Node right;

        Node(String value) {
            this.value = value;
        }

        public void print() {
            print("", true);
        }

        private void print(String prefix, boolean isTail) {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + value);
            if (right != null) right.print(prefix + (isTail ? "    " : "│   "), false);
            if (left != null) left.print(prefix + (isTail ? "    " : "│   "), true);
        }
    }
}
