package Assessmentques;

public class Recursion {
	
	 void add() {
		System.out.println("Hi...".concat("Good morning"));
		add();		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r = new Recursion();
		r.add();

	}
}
	