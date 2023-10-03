package Inner_Class_Package;

 class A 
 { 
 void m1() 
 { 
 System.out.println("m1-A"); 
 } 
 class B //Member Inner Class 
 { 
  //static int i=10;--> Error 
	 
 /* we cannot declare static variable in member inner class directly 
   for declaring it we have to use final keyword with it */
	 
 static final int j=20; 
 void m2() 
 { 
 System.out.println("m2-B"); 
 System.out.println(j); 
 } 
 void m3() 
 { 
 System.out.println("m3-B"); 
 } 
 } 
 } 
 
public class Member_InnerClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); // outer class object creation
		 a.m1(); 
		 
		 //a.m2();--> Error 
		 
	/* We cannot access inner class method with outer class object
for accessing it we have to create separate inner class object like as follows */
		
		 A.B ab=new A().new B(); // inner class  object creation
		 ab.m2(); 
		 ab.m3(); 
		 //ab.m1();--> Error 
 
		 /* We cannot access outer class method with inner class object
		 for accessing it we have to create separate outer class object like above */
	}

}
