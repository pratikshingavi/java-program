package com.operation.junitexample;
import junit.framework.TestCase;


 public class Demo  extends TestCase{
	 public void testSum() {
		   assertEquals(2,sum(1,1));
		   System.out.println("hiiii");
		  }
		   int sum(int num1,int num2){
				  return num1+num2;
				  }

	public static void main(String[] args) {
		Demo caltest=new Demo();
		caltest.testSum();
	}

}
