package com.opera.firstweek11_11_23;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.opera.firstweek09_11_23.*;
public class UnaryTest 
{
  UnaryOperator unaryOperator=new UnaryOperator();
  @Test
  public void preIncrementTest() {
	  int result=unaryOperator.preIncrement(76);
	 System.out.println(result);
  }
  
  @Test
  public void postIncrementtest() {
	  int result=unaryOperator.postIncrement(20);
	 System.out.println(result);
  }
  @Test
  public void preDecrementTest() {
	  int result=unaryOperator.preDecrement(8);
	 System.out.println(result);
  }
  
  @Test
  public void postDecrementtest() {
	  int result=unaryOperator.postDecrement(9);
	 System.out.println(result);
  }
}
