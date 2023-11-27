
package com.exce.secondweek17_11_23;

public class NullPointerEx
{
	public static void nullPoint() {
		try{
			String name=null;
			System.out.println(name.toUpperCase());
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) {
      try {
    	  nullPoint();
      }catch (Exception e) {
    	  System.out.println(e.getMessage());
	}
	}

}
