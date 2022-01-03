package online.sujithchenanath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils utils=new MathUtils();
		int expected=2;
		int actual=utils.add(1, 1);
		assertEquals(expected,actual,"The add method fails..");
	}
	
	@Test
	void testArea() {
		MathUtils utils=new MathUtils();
		double expected=314.1592653589793;
		double actual=utils.area(10);
		assertEquals(expected,actual,"The area method fails..");
	}

}
