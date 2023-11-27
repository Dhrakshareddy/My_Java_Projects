package com.exce.thirdweek20_11_23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrowException
{
	public void method1() throws FileNotFoundException{
		FileInputStream fileInputStream=null;
		try {
		  FileInputStream file=new FileInputStream("desktop/folder");
		}catch (FileNotFoundException e) {
		  System.out.println(e.getMessage());
		  FileInputStream file=new FileInputStream("desktop/folder");
		}
		System.out.println("handled");
	}
	public static void main(String[] args) throws FileNotFoundException {
		ReThrowException reThrowException = new ReThrowException();
		try {
			reThrowException.method1();
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
