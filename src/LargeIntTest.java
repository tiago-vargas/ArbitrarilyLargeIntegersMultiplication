import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargeIntTest {
    @Test
    void parsingSmallNumberIntoSingleCell() {
        var number = new LargeInt("123");

        Assertions.assertEquals(123, number.cells.head.value);
    }

    @Test
    void parsingLargeIntIntoThreeDigitCells() {
        var number = new LargeInt("123456");

        Assertions.assertEquals(123, number.cells.head.value);
        Assertions.assertEquals(456, number.cells.head.rightNode.value);
    }
}
