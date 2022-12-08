import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {
    @Test
    void newList_ShouldNotHaveHead() {
        var list = new DoublyLinkedList();

        Assertions.assertNull(list.head);
    }

    @Test
    void lastAddedItem_ShouldBeHeadOfList() {
        var list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertEquals(3, list.head.value);
    }

    @Test
    void addedItem_ShouldBeToTheLeftOfPreviousItem() {
        var list = new DoublyLinkedList();
        list.add(1);
        list.add(2);

        Assertions.assertEquals(2, list.head.value);
        Assertions.assertEquals(1, list.head.rightNode.value);
    }

    @Test
    void addingTooLargeNumber_ShouldThrowException() {
        var list = new DoublyLinkedList();

        Assertions.assertThrows(NodeValueOutOfBoundsException.class, () -> list.add(1234));
    }
}
