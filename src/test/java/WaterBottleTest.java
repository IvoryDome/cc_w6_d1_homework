import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class WaterBottleTest {
    private WaterBottle myWaterBottle;

    @Before
    public void before(){
        myWaterBottle = new WaterBottle(100);
    }

    @Test
    public void doesVolumeDecreaseWhenDrunk(){
        assertEquals(90, myWaterBottle.drink());
    }

    @Test
    public void testEmpty(){
        assertEquals(0, myWaterBottle.empty());
    }

    @Test
    public void testFill(){
        assertEquals(100, myWaterBottle.fill());
    }












}
