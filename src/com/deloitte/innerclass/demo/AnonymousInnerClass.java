package com.deloitte.innerclass.demo;

@FunctionalInterface
interface Inter1{
	void show();
	
}

@FunctionalInterface
interface Inter2{
	int sum(int i, int j);
}

public class AnonymousInnerClass {

	public static void main(String[] args) 
	{
      /*Inter1 i1= new Inter1()    // no need for separate class for a single fun: void show()
      {                
    	  public void show() 
    	  {
    		  System.out.println("Hi anonymous inner class");
    	  }
      };
      i1.show();*/
		
       Inter1 i1= () -> System.out.println("Hello"); //Lambda expression is equivalent to above codes
	   i1.show();
	   Inter2 i2=(i,j) -> i+j;
	   System.out.println("Sum = "+i2.sum(5, 6));
	  /*OR
	   *  Inter2 i2= (i,j) -> {
		                   System.out.println("Sum : ");
	                        return i+j;
	   };*/
	                      
	}

}
