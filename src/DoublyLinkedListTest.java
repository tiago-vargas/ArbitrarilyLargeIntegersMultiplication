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
}
