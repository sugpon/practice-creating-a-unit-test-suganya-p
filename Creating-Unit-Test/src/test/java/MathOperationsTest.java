import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MathOperationsTest {

    @Test
    public void testDivide_HappyPath(){
        MathOperations mathOperations= new MathOperations();
        int result = mathOperations.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivide_EdgeCase_ZeroNumerator() {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.divide(0, 5);
        assertEquals(0, result);
    }

    @Test
    public void testDivide_Exception_DivideByZero() {
        MathOperations mathOperations = new MathOperations();
        assertThrows(ArithmeticException.class, () -> mathOperations.divide(10, 0));
    }
}

