package Inner_Class_Package;
 class P 
 { 
 void m1() 
 { 
 class B // Method_InnerClass
 { 
 void m2() 
 
 { 
 System.out.println("m2-B"); 
  } 
  void m3() 
 { 
 System.out.println("m3-B"); 
  } 
 }//B // scope of B ends here
  B b=new B(); 
  /* we have to create object for that Method_InnerClass class in the respective method only,
   * we have to access the members of that Method_InnerClass class inside the respective method. */
  b.m2(); 
  b.m3(); 
 }//m1() //scope of m1 ends here
 }//A // scope of A ends here
 public class Method_InnerClass_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P a=new P(); 
		 a.m1();
		 // a.m2();
/* scope of that is available up to the respective method only,
 *  we have to create object for that Method_InnerClass class in the respective method only,
 *  we have to access the members of that Method_InnerClass class inside the respective method. */

	}

}
