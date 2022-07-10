import controller.Mathx;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathxTest {


    static Mathx mt;

    @Before
    public void create(){
        mt = new Mathx();
    }

    @Test
    public void addTest(){
        assertEquals(20,mt.add(-10,20));
    }

    @Test
    public void subTest(){
        assertEquals(-20,mt.sub(-10,10));
    }
//
//    @Test
//    public void multTest(){
//        assertEquals(100,mt.mul(-10,10));
//    }
//
//    @Test
//    public void divTest(){
//        assertEquals(10,mt.div(100,10));
//    }
}
