package com.corenuts.loopings;

public class LoopingStatements 
{
	public void whileLoop() {
		boolean flag=true;
		int i=0;
		while(flag) {
			System.out.println("loop"+i);
			int j=0;
			do {
				if(i==6) {
					System.out.println("executing..");
					break;
				}
				i++;
			}while(j<10);
				flag=(i++<=10);
			}
		}
	
	}
