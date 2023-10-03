package Inner_Class_Package;

 interface I 
  { 
  void m1(); 
  void m2(); 
  void m3(); 
  } 

class OuterA 
 { 
	I i=new I()
 {
  public void m1() 
  { 
  System.out.println("m1-AIC"); 
  }
  public void m2() 
  { 
  System.out.println("m2-AIC"); 
  } 
  public void m3() 
  { 
  System.out.println("m3-AIC"); 
  } 
  public void m4() 
  { 
  System.out.println("m4-AIC"); 
  } 
  };
 }

public class Anonymous_InnerClass_InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	    OuterA o=new OuterA(); 
		 o.i.m1(); 
		 o.i.m2(); 
		 o.i.m3(); 
	   //o.i.m4();--> Error

	}

}
