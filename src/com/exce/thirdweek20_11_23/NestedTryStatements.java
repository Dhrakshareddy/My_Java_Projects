package com.exce.thirdweek20_11_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedTryStatements {
	public void exception1()throws RuntimeException {
		FileInputStream fileInputStream =null;
		try{
			try {
				FileInputStream fileinput=new FileInputStream("desktop/Dhraksha.txt");
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}finally {
			if(fileInputStream!=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		}
	}
	public static void main(String[] args)throws Exception {
		NestedTryStatements nestedTryStatements =new  NestedTryStatements();
		nestedTryStatements.exception1();
	}

}
