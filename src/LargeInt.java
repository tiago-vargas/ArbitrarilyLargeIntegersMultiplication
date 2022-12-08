public class LargeInt {
    DoublyLinkedList cells;
    String representation;

    public LargeInt(String representation) {
        cells = parseIntoCells(representation);
        this.representation = representation;
    }

    private DoublyLinkedList parseIntoCells(String representation) {
        cells = new DoublyLinkedList();

        int numberOfDigits = representation.length();

        if (numberOfDigits <= 3) {
            cells.add(Integer.parseInt(representation));
            return cells;
        }

        int lastIndex = numberOfDigits - 1;
        int antepenultimateIndex = lastIndex - 2;
        String lastThreeDigits = representation.substring(antepenultimateIndex);
        insertCell(Integer.parseInt(lastThreeDigits));

        cells.add(Integer.parseInt(representation.substring(0, antepenultimateIndex)));

        return cells;
    }

    private void insertCell(int value) throws CellValueOutOfRangeException {
        if (0 <= value && value <= 999)
            cells.add(value);
        else
            throw new CellValueOutOfRangeException("Value for cell is out of range [0, 999]");
    }
}
