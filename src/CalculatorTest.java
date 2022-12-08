import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void multiplyingByOne() {
        var calculator = new Calculator();
        var multiplicand = new LargeInt("123456");
        var multiplier = new LargeInt("1");

        LargeInt result = calculator.multiply(multiplicand, multiplier);

        Assertions.assertEquals("123456", result.representation);
    }
}
