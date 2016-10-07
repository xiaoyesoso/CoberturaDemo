package edu.zju.sc.aoot;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;


/**
 * Unit test for simple App.
 */

public class TestDie {

	private Die die1,die2;

	@Before
	public void setUp() {

	    die1 = new Die();
	    die2 = new Die(10);
	    die1.roll();
	    die2.roll();
	}

	@Test
	public void testdie1numofsides() {
		Assert.assertEquals(6, die1.numofsides);
	}
	
	@Test
	public void testdie1Face() {
		Assert.assertTrue(die1.faceValue >= 1 && die1.faceValue <= 6);
	}
	
	@Test
	public void testdie2numofsides() {
		Assert.assertEquals(10, die2.numofsides);
	}
	
	@Test
	public void testdie2Face() {
		Assert.assertTrue(die2.faceValue >= 1 && die2.faceValue <= 10);
	}

	@After
	public void tearDown() {
	}

}