package com.deloitte.innerclass.demo;

interface Operation{
	double operate(double a, double b);
}

class Calculation{
	double calculate(double i, double j, Operation op) {
		return op.operate(i,j);
	}
}
public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calculation cal= new Calculation();
     double a=3.6, b=3.3;
     double sum= cal.calculate(a, b , (double x, double y)-> x+y); // declaring as double x is optional, compiler knows otherwise too.
     double mul= cal.calculate(a, b , (x,y)-> x*y);
     System.out.println("Sum= "+sum+"\nProduct= "+mul);
	}

}
