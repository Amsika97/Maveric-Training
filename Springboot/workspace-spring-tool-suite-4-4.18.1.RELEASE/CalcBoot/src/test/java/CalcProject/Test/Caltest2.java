package CalcProject.Test;
import static org.junit.jupiter.api.Assertions.*;
import CalcProject.Calculator;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class Caltest2 {
	@Autowired
	Calculator  calc = new Calculator();
	int i =5;
	int j =5;
// @Before
// public void setup()
// {
//	 Calculator  calc = new Calculator();
//     int i =5;
//	 int j =5;
//	// calc.add();
// }
//	@Test
//	void test() {
//		fail("Not yet implemented");
//		
//	}
	@Test
	
	public void  multest()
	{
		int i =5;
		int j =5;
		int expectedResult = 25;
		int result = calc.multiply(i, j);;
		assertEquals(expectedResult,result);
	}
	@Test
	public void  dividetest()
	{ 
		int expectedResult = 1;
		int result = calc.division(i, j);;
		assertEquals(expectedResult,result);
	}
	

}
