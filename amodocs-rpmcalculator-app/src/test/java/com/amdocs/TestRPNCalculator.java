package com.amdocs;
import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;
public class TestRPNCalculator {
	private RPNCalculator rpnCalculator; 
	private double expectedValue, actualResult;
	@AfterClass 
	public static  void tearDown() {
		System.out.println("After class method");
	}
	@BeforeClass
	public static void initOnce() {
		System.out.println("Before class method");
	}
	@Before
	public void init() {
		rpnCalculator = new RPNCalculator();  
		actualResult=expectedValue=0.0;
	}
	@After
	public void cleanUp() {
		rpnCalculator =null;
		//assertEquals(expectedValue, actualResult ,0.001);
	}

	@Test
	public void testSimpleAddition() {
		//RPNCalculator rpmcalculator= new RPNCalculator();
		
		actualResult= rpnCalculator.evaluate("10 15 + ");
		expectedValue=25.0;
		
		assertEquals(expectedValue, actualResult ,0.001);
	}
	@Test
	public void testSimpleSubtraction() {
		actualResult= rpnCalculator.evaluate("10 115 -");
		expectedValue=-105.0;
		
		assertEquals(expectedValue, actualResult ,0.001);
	}
	@Test
	public void testSimpleDivision() {
		actualResult= rpnCalculator.evaluate("100 10 /");
		expectedValue=10.0;
		
		assertEquals(expectedValue, actualResult ,0.001);
	}
	@Category(SmokeTest.class)
	@Test
	public void testSimpleMultiplication() {
		actualResult= rpnCalculator.evaluate("10 5 *");
		expectedValue=50.0;
		
		assertEquals(expectedValue, actualResult ,0.001);
		
	}
}
