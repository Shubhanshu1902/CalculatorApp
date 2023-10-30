package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    Calculator calcObj = new Calculator();

    @Test
    public void testAdd()
	{
		// Test 1
		assertEquals((Double) 4.0, calcObj.add(1.0,3.0));

		// Test 2
		assertEquals((Double) 0.0, calcObj.add(0.0,0.0));

		// Test 3
		assertEquals((Double) 9.525, calcObj.add(9.5,0.025));

		// Test 4
		assertEquals((Double) 1.0, calcObj.add(2.0,-1.0));
	}
    @Test
    public void testSub()
	{
		// Test 1
		assertEquals((Double) 4.0, calcObj.sub(7.0,3.0));

		// Test 2
		assertEquals((Double) 0.0, calcObj.sub(2.0,2.0));

		// Test 3
        Double ts = -9.525;
		assertEquals(ts, calcObj.sub(-9.5,0.025));

		// Test 4
		assertEquals((Double) 1.0, calcObj.sub(2.0,1.0));
	}

    @Test
    public void testMul()
	{
		// Test 1
		assertEquals((Double) 4.0, calcObj.mul(1.0,4.0));

		// Test 2
		assertEquals((Double) 0.0, calcObj.mul(10.0,0.0));

		// Test 3
        Double ts = -9.3;
		assertEquals(ts, calcObj.mul(-3.1,3.0));

		// Test 4
		assertEquals((Double) 1.0, calcObj.mul(-1.0,-1.0));
	}
    
    @Test
    public void testDiv()
	{
		// Test 1
		assertEquals((Double) 4.0, calcObj.div(4.0,1.0));

		// Test 2
		assertEquals((Double) 0.0, calcObj.div(0.0,10.0));

		// Test 3
        Double ts = -3.1;
		assertEquals(ts, calcObj.div(-9.3,3.0));

		// Test 4
		assertNull(calcObj.div(19.0, 0.0));
	}
}
