public class LargeInt {
    DoublyLinkedList cells;
    String representation;

    public LargeInt(String representation) {
        this.cells = parse(representation);
        this.representation = representation;
    }

    private DoublyLinkedList parse(String representation) {
        var cells = new DoublyLinkedList();

        int lastIndex = representation.length() - 1;
        int antepenultimateIndex = lastIndex - 2;
        cells.add(Integer.parseInt(representation.substring(antepenultimateIndex)));

        if (representation.length() > 3)
            cells.add(Integer.parseInt(representation.substring(0, antepenultimateIndex)));

        return cells;
    }
}
