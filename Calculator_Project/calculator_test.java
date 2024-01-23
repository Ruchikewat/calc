package Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, Calculator.subtract(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, Calculator.divide(5, 2));
    }

}