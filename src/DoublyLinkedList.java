public class DoublyLinkedList {
    Node head;

    public void add(int value) {
        Node newHead = new Node(value);
        Node currentHead = this.head;

        if (currentHead != null)
            newHead.rightNode = currentHead;

        this.head = newHead;
    }

    protected static class Node {
        public int value;
        public Node rightNode;

        public Node(int value) {
            this.value = value;
            this.rightNode = null;
        }
    }
}
