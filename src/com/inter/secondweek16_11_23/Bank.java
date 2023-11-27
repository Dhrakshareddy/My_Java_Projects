package com.inter.secondweek16_11_23;
abstract class IciciBank implements Bank{
}
 interface Bank 
{
	abstract void deposit();
	abstract void withdraw();
	abstract void checkBalance();
	//it won't show the error like unimplemented abstract methods
}
