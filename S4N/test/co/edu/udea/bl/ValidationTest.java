package co.edu.udea.bl;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unitary test for Validation class
 * @author Daniel Uribe Giraldo
 *
 */
public class ValidationTest {

	@Test
	public void testCheckThreeMultiploForTenNumber() {
		Validation validation=new Validation();
		boolean multiple=false;
		multiple=validation.checkThreeMultiplo(10);
		assertTrue(multiple==false);
	}

	@Test
	public void testCheckFiveMultiploForTenNumber() {
		Validation validation=new Validation();
		boolean multiple=false;
		multiple=validation.checkFiveMultiplo(10);
		assertTrue(multiple==true);
	}
	
	@Test
	public void testCheckThreeMultiploForNineNumber() {
		Validation validation=new Validation();
		boolean multiple=false;
		multiple=validation.checkThreeMultiplo(9);
		assertTrue(multiple==true);
	}
	
	@Test
	public void testCheckFiveMultiploForNineNumber() {
		Validation validation=new Validation();
		boolean multiple=false;
		multiple=validation.checkFiveMultiplo(9);
		assertTrue(multiple==false);
	}
	
	@Test
	public void testCheckFiveMultiploForFifteenNumber() {
		Validation validation=new Validation();
		boolean multiple=false;
		multiple=validation.checkFiveMultiplo(15);
		assertTrue(multiple==true);
	}
	
	@Test
	public void testCheckThreeMultiploForFifteenNumber() {
		Validation validation=new Validation();
		boolean multiple=false;
		multiple=validation.checkThreeMultiplo(15);
		assertTrue(multiple==true);
	}
	
	@Test
	public void testCheckFiveMultiploForThirteenNumber() {
		Validation validation=new Validation();
		boolean multiple=false;
		multiple=validation.checkFiveMultiplo(13);
		assertTrue(multiple==false);
	}
	
	@Test
	public void testCheckThreeMultiploForThirteenNumber() {
		Validation validation=new Validation();
		boolean multiple=false;
		multiple=validation.checkThreeMultiplo(13);
		assertTrue(multiple==false);
	}

}
