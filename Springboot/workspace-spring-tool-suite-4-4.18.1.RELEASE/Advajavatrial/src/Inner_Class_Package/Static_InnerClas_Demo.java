package Inner_Class_Package;

class O 
 { 
 static class B 
 { 
/* Static inner classes are able to allow only static members of the outer class,
	    it will not allow non static members of the outer class */
 void m1() 
 { 
 System.out.println("m1-B"); 
 } 
 void m2() 
 { 
 System.out.println("m2-B"); 
 } 
 static void m3() 
 { 
 System.out.println("m3-B"); 
 } 
 } 
 } 
 
public class Static_InnerClas_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O.B ab=new O.B(); 
		 ab.m1(); 
		 ab.m2(); 
		 O.B.m3(); 

	}

}
