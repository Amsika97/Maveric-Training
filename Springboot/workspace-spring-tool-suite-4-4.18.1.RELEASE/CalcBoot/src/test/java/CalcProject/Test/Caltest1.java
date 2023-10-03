package CalcProject.Test;

import static org.junit.jupiter.api.Assertions.*;
import CalcProject.Calculator;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

//import CalcProject.Calculator;


class Caltest1 {
	 
	@Autowired
	static Calculator  calc ;
	int i=5;
	int j=5;
	
 @BeforeAll
 public static void  setup()
 {
	  calc = new Calculator();
  
 }

	@Test
	public void  addTest()
	{
		int expectedResult = 	10;
		int result = calc.add(i,j);
		assertEquals(expectedResult,result);
	}
	@Test
	public void  subtest()
	{ 
		
		int expectedResult = 0;
		int result = calc.sub(i, j);;
		assertEquals(expectedResult,result);
	}

}
