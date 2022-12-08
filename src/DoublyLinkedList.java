public class DoublyLinkedList {
    Node head;

    public void add(int i) {
        this.head = new Node(i);
    }

    protected static class Node {
        public int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
