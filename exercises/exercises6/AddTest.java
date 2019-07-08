package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void xyZero() {
		assertEquals(0, Add.add(0, 0));
		
		//
		// write other test cases here:
		//
	}
	
	@Test
	public void basicAddition() {
		assertEquals(5, Add.add(3, 2));
		assertEquals(19, Add.add(9, 10));
	}
	
	@Test
	public void addAny() {
		assertEquals(1, Add.addAny(3, -2));
		assertEquals(-3, Add.addAny(-5, 2));
		
	}
	public void complexaddAny() {
		assertEquals(-8, Add.addAny(-400, 392));
		assertEquals(-90, Add.addAny(-90, 0));
		assertEquals(-30, Add.addAny(0, -30));
	}

}
