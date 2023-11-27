package com.opera.firstweek11_11_23;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.opera.firstweek09_11_23.LogicalOperator;

public class LogicalTest
{
	LogicalOperator logicalOperator=new LogicalOperator();
	
	@Test
	public void andTest() {
		boolean result=logicalOperator.andOperator(12, 20);
		assertFalse(result);
				
	}
	@Test
	public void orTest() {
		boolean result=logicalOperator.orOperator(32, 10);
		assertTrue(result);
	}
	@Test
	public void notTest() {
		boolean result=logicalOperator.notOperator(32, 20);
		assertFalse(result);
	}
}
