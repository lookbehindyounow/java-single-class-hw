import com.codeclan.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(2,2));
    }
    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(5,2));
    }
    @Test
    public void canMultiply(){
        assertEquals(10, calculator.multiply(5,2));
    }
    @Test
    public void canDivide(){
        assertEquals(10, calculator.divide(20,2), 0);
    }
}
