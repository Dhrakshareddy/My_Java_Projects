package com.opera.firstweek09_11_23;

public class LogicalOperator 
{
  public boolean andOperator(int value1,int value2) {
	  return (value1>value2)&&(value1<=value2);
	  
  }
  public boolean orOperator(int value1,int value2) {
	  return (value1>=value2)||(value1>value2);
	  
  }
  public boolean notOperator(int value1,int value2) {
	  return (value1>=value2)!=(value1<value2);
	  
  }
}
