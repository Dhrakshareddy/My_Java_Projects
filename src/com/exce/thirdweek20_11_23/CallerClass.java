package com.exce.thirdweek20_11_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

import org.hamcrest.CustomMatcher;
class callerClassException extends Exception{
	public callerClassException(String mesg) {
		super(mesg);
	}
	
}
public class CallerClass 
{
	static void method1() throws callerClassException{
		throw new callerClassException("callerClassException");
		
	}

	public static void main(String[] args)  {
		try {
			method1();
		}catch (callerClassException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block is executed");
		}
	}

}
