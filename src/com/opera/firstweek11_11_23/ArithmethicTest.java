package com.opera.firstweek11_11_23;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cnts.variables03_11_23.*;
import com.opera.firstweek09_11_23.ArithmeticOperators;
public class ArithmethicTest {
	
    ArithmeticOperators arithmeticOperator=new ArithmeticOperators();
    
    @Test
    public void additionTest() {
    int result=arithmeticOperator.addition(45, 32);
    assertEquals(7, result);
    }
    
    @Test
    public void subractionTest() {
    	int result=arithmeticOperator.subraction(54, 23);
    	assertEquals(43, result);
    }
    @Test
    public void multiplicationTest() {
     int result=arithmeticOperator.mutliplication(34, 10);
    assertEquals(340, result);
    }
    
    @Test
    public void divisionTest() {
    	int result=arithmeticOperator.division(54, 2);
    	assertEquals(27, result);
    }
    
    @Test
    public void modularTest() {
    	int result=arithmeticOperator.modular(56, 2);
    	assertEquals(56, result);
    }
    

}
