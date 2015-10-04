import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator;

	@Before
	public void beforeTest() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		Assert.assertEquals(30, calculator.add(20, 10));
		Assert.assertEquals(-4, calculator.add(-2, -2));

		Assert.assertNotEquals(30, calculator.add(1, 1));
		Assert.assertNotEquals(30, calculator.add(1, -11));
	}

	@Test
	public void subTest() {
		Assert.assertEquals(10, calculator.sub(20, 10));
		Assert.assertEquals(0, calculator.sub(-2, -2));

		Assert.assertNotEquals(2, calculator.sub(1, 1));
		Assert.assertNotEquals(30, calculator.sub(1, -11));
	}

	@Test
	public void multTest() {
		Assert.assertEquals(200, calculator.mult(20, 10));
		Assert.assertEquals(4, calculator.mult(-2, -2));

		Assert.assertNotEquals(2, calculator.mult(1, 1));
		Assert.assertNotEquals(30, calculator.mult(1, -11));
	}

	@Test
	public void divTest() {
		Assert.assertEquals(2, calculator.div(20, 10));
		Assert.assertEquals(1, calculator.div(-2, -2));

		Assert.assertNotEquals(2, calculator.div(1, 1));
		Assert.assertNotEquals(30, calculator.div(1, -11));
	}

	@Test
	public void calcTest() {
		Assert.assertEquals("30", calculator.calc(10, 20, "+"));
		Assert.assertEquals("-10", calculator.calc(10, 20, "-"));
		Assert.assertEquals("200", calculator.calc(10, 20, "*"));
		Assert.assertEquals("1", calculator.calc(20, 20, "/"));
		Assert.assertEquals("a is not a valid operator",
				calculator.calc(20, 20, "a"));
	}
}
