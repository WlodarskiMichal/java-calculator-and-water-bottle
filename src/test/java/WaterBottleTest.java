import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before(){ waterBottle = new WaterBottle(100);}
    @Test
    public void hasVolume(){
//        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(100, waterBottle.getVolume());
    }
    @Test
    public void canDrink(){
//        WaterBottle waterBottle = new WaterBottle(100);
        assertEquals(90, waterBottle.drink());
    }
    @Test
    public void canEmpty(){
//        WaterBottle waterBottle = new WaterBottle(100)
        assertEquals(0, waterBottle.empty());
    }
    @Test
    public void canFillUp(){
        assertEquals(100, waterBottle.fillUp());
    }

}
