package Inner_Class_Package;

abstract class C 
 { 
 void m1() 
  { 
 System.out.println("m1-A"); 
  } 
 abstract void m2(); 
 abstract void m3(); 
 } 
 class Outer 
 { 
 C a=new  C() 
 { 
 void m2() 
 { 
 System.out.println("m2-AIC"); 
 } 
 void m3() 
 { 
 System.out.println("m3-AIC"); 
 } 
 void m4() 
 { 
 System.out.println("m4-AIC"); 
 } 
 };
 } 


public class Anonymous_InnerClass_AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o=new Outer(); 
		 o.a.m1(); 
		 o.a.m2(); 
		 o.a.m3(); 

	}

}
