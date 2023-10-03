package Assessmentques;

public class InheritanceandPolymorphism extends car
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceandPolymorphism c=new InheritanceandPolymorphism();
		System.out.println("Inheritating the Super class method feature");
		c.feature();
		Vehicle v= new Vehicle();
		v.Color();
	}
}

 class Vehicle extends car {
	void Color()
	{
		System.out.println("Overridding the Color method of Super class");
		System.out.println("Colors of Car is white");
	}
}
 class car{
	 void feature()
		{
		System.out.println("Car have following feature:");
		System.out.println("Milage");
		System.out.println("Colors");
		System.out.println("Different type of designs ");
		}
		void Color()
		{
			System.out.println("Colors of car is red");	
		}
	 
 }
 
 
	

