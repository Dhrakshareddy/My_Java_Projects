package com.exce.thirdweek20_11_23;
class CustomException2 extends Exception{
	public CustomException2(String mesg) {
		super(mesg);
	}
}
public class ThrowsAndThrow 
{
	public void exception() throws CustomException {
		try {
			throw new CustomException2("CustomeException2");
		}catch (CustomException2 e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public static void main(String[] args) {
		ThrowsAndThrow throwsAndThrow =new  ThrowsAndThrow();
		try {
			throwsAndThrow.exception();
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
