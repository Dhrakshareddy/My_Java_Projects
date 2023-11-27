package com.exce.thirdweek20_11_23;
class CustomException extends Exception{
	public  CustomException(String mesg) {
		super(mesg);
	}
}
public class UserDefineExcInCatch {
	static void userDefined() {
		try {
			System.out.println(30/0);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			try{
				throw new CustomException("CustomException");
			}catch (CustomException e1) {
				System.out.println(e1.getMessage());
			}
		}
	}
	public static void main(String[] args) {
		UserDefineExcInCatch userDefineExcInCatch =new UserDefineExcInCatch();
		userDefineExcInCatch.userDefined();
	}

}
