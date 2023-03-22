import org.example.Calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestCalculator
{
    Calculator calc = new Calculator();
    double error=1e-15;
    @Test
    public void testRoot1()
    {
        double cal_value= calc.root(25.0);
        double exp_value=5.0;
        assertEquals(cal_value,exp_value,error);
    }

    @Test
    public void testRoot2()
    {
        double cal_value= calc.root(16.0);
        double exp_value=5.0;
        assertNotEquals(cal_value,exp_value,error);
    }

    @Test
    public void testFactorial1()
    {
        double cal_value= calc.factorial(3);
        double exp_value=6.0;
        assertEquals(cal_value,exp_value,error);
    }

    @Test
    public void testFactorial2()
    {
        double cal_value= calc.root(2);
        double exp_value=6.0;
        assertNotEquals(cal_value,exp_value,error);
    }

    @Test
    public void testLog1()
    {
        double cal_value= calc.log(1.0);
        double exp_value=0.0;
        assertEquals(cal_value,exp_value,error);
    }

    @Test
    public void testLog2()
    {
        double cal_value= calc.root(1.0);
        double exp_value=5.0;
        assertNotEquals(cal_value,exp_value,error);
    }

    @Test
    public void testPower1()
    {
        double cal_value= calc.power(2.0,4.0);
        double exp_value=16.0;
        assertEquals(cal_value,exp_value,error);
    }

    @Test
    public void testPower2()
    {
        double cal_value= calc.power(2.0,4.0);
        double exp_value=5.0;
        assertNotEquals(cal_value,exp_value,error);
    }
}
