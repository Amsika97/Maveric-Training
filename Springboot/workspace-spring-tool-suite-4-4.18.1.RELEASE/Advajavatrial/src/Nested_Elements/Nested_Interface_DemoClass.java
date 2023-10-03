package Nested_Elements;

class OuterClass {
    // Outer class code...    
    // Nested interface declaration
    public interface NestedInterface 
// we can give any access modifier to nested interface if it is declared within a class
    {
        void nestedMethod();
    }
}
class NestedInterfaceImplementation implements OuterClass.NestedInterface {
    public void nestedMethod() {
        System.out.println("Implementation of nestedMethod");
    }
}
public class Nested_Interface_DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterfaceImplementation implementation = new NestedInterfaceImplementation();
        implementation.nestedMethod();

	}

}
