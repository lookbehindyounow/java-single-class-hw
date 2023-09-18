import com.codeclan.Printer;
import com.codeclan.WaterBottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100,10);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }
    @Test
    public void hasToner(){
        assertEquals(10, printer.getToner());
    }
    @Test
    public void canPrint(){
        printer.print(5,5);
        assertEquals(75, printer.getSheets());
        assertEquals(9, printer.getToner());
    }
    @Test
    public void notEnoughPaper(){
        printer.print(10,11);
        assertEquals(100, printer.getSheets());
    }
    @Test
    public void notEnoughToner(){
        for (int i=0;i<10;i++){
            printer.print(1,1);
        }
        assertEquals(0,printer.getToner());
        printer.print(1,1);
        assertEquals(0,printer.getToner());
    }
}
