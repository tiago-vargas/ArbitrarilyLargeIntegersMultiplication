public class LargeInt {
    DoublyLinkedList cells;
    String representation;

    public LargeInt(String representation) {
        this.cells = parse(representation);
        this.representation = representation;
    }

    private DoublyLinkedList parse(String representation) {
        var cells = new DoublyLinkedList();

        cells.add(Integer.parseInt(representation));

        return cells;
    }
}
