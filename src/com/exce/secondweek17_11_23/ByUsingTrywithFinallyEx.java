package com.exce.secondweek17_11_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByUsingTrywithFinallyEx 
{
	public void exception1() {
		FileInputStream fileInputStream =null;
		try{
			try {
				FileInputStream fileinput=new FileInputStream("desktop/Dhraksha.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}finally {
			if(fileInputStream!=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		}
	}
	public static void main(String[] args)  {
		ByUsingTrywithFinallyEx byUsingTrywithFinallyEx = new ByUsingTrywithFinallyEx();
		byUsingTrywithFinallyEx.exception1();
	}

}
