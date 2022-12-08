import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {
    @Test
    void newListShouldNotHaveHead() {
        var list = new DoublyLinkedList();

        Assertions.assertNull(list.head);
    }
}
