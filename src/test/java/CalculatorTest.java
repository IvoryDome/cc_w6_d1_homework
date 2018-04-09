import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    private Calculator myCalculator;


    @Before
    public void before(){
        myCalculator = new Calculator(60, 30);
    }

    @Test
    public void doesSumWork(){
        assertEquals(90, myCalculator.sum());
    }

    @Test
    public void doesSubtractWork(){
        assertEquals(30, myCalculator.subtract());
    }

    @Test
    public void doesMultiplyWork(){
        assertEquals(1800, myCalculator.multiply());
    }

    @Test
    public void doesDivideWork(){
        assertEquals(2, myCalculator.divide());
    }






}
