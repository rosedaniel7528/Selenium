package test;

public class utility extends Utility2 {

	int a;

	public utility(int a) {   //constructor 
		super(a); //super keyword used when inheritance in place this will invoke the parent constructor
		this.a=a; //this. refers to current class variable a 
	}	
	public int increment() {
		a = a + 1;
		return a;
	}	
	public int decrement() {
		a = a - 1;
		return a;
	}
}
