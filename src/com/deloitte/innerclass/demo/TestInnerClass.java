package com.deloitte.innerclass.demo;

class Outer{
	
	void outerMethod() {
	 System.out.println("hi outer");
	 }
	
	class Inner1{
		void innerMethod()
		{
			System.out.println("hi inner1");
		}
	}
	
	static class Inner2{
		void innerMethod()
		{
			System.out.println("hi inner2");
		}
	}
}

public class TestInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Outer outObj= new Outer();
      outObj.outerMethod();
      Outer.Inner1 inner1Obj= outObj.new Inner1(); 
      inner1Obj.innerMethod();
      Outer.Inner2 inner2Obj= new Outer.Inner2();
      inner2Obj.innerMethod();
	}
	/* NOTE
	 * When void innerMethod is static void innerMethod();
	 * Declare inner obj as
	 * Outer.Inner innerObj= new Outer.Inner();
	 */

}
