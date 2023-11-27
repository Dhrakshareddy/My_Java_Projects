package com.opera.firstweek11_11_23;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.opera.firstweek09_11_23.MiscOperator;

public class MiscTest 
{
	MiscOperator miscOperator1=new MiscOperator();
	@Test
	public void miscTest() {
		int result=miscOperator1.miscOperate(2, 5);
		assertEquals(34, result);
	}
	

	
}
