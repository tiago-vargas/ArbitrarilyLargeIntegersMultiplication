public class DoublyLinkedList {
    Node head;

    public void add(int value) throws NodeValueOutOfBoundsException {
        if (value < 0 || value > 999)
            throw new NodeValueOutOfBoundsException("Value for node is out of bounds");

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
