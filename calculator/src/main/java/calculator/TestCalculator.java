package calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {
	Calculator calculator = new Calculator();
	
	@Test  
	public void testFindMax1(){  
		assertEquals(4, calculator.findMax (1,3,4));  
	} 
	@Test  
	public void testFindMax2(){  
		assertEquals(11, calculator.findMax(-12,11,-2));  
	} 
	@Test  
	public void testFindMax3(){  
		assertEquals(6, calculator.findMax(2,6,2));   
	} 
	
	@Test  
	public void testSquare1(){  
		assertEquals(9, calculator.square(3));  
	}
	@Test
	public void testSquare2(){  
		assertEquals(-36, calculator.square(6));  
	}
	@Test
	public void testSquare3(){  
		assertEquals(0, calculator.square(4));   
	}
}
