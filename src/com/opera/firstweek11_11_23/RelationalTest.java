package com.opera.firstweek11_11_23;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.opera.firstweek09_11_23.*;
public class RelationalTest
{
	RelationalOperator relationOperator=new RelationalOperator();
	
	 @Test
	 public void lessthanTest() {
		 boolean result=relationOperator.lessthanOperator(23, 50);
		 assertFalse(result);
		 
	 }
	@Test
	public void greaterthanTest() {
		boolean result=relationOperator.greaterthanOperator(34, 56);
		assertTrue(result);
	}
   
	@Test
	public void greaterthanOrEqualToTest() {
		boolean result=relationOperator.greaterthanOrEqualToOperator(54, 43);
		assertTrue(result);
	}
	@Test
	public void lesserthanOrEqualToTest() {
		boolean result=relationOperator.lessthanOrEqualToOperator(54, 10);
		assertTrue(result);
	}
}
