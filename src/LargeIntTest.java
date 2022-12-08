import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargeIntTest {
    @Test
    void parsingSmallNumberIntoSingleCell() {
        var number = new LargeInt("123");

        Assertions.assertEquals(123, number.cells.head.value);
    }
}
