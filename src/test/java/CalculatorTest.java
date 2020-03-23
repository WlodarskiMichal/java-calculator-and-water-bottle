import com.sun.deploy.net.MessageHeader;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void canAdd() {
        Calculator calculator = new Calculator(2, 2);
        assertEquals(4, calculator.add());
    }
    @Test
    public void canSubstract(){
        Calculator calculator = new Calculator(6, 2);
        assertEquals(4, calculator.substract());
    }
}
