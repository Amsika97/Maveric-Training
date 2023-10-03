package Nested_Elements;

interface OuterClassA {
    // Outer class code...    
    // Nested interface declaration
    public interface NestedInterfaceA 
// we cannot give any access modifier to nested interface 
// if it is declared within an interface, it must be public
    {
        void nestedMethod();
    }
}
class NestedInterfaceAImplementation implements OuterClassA.NestedInterfaceA {
    public void nestedMethod() {
        System.out.println("Implementation of nestedMethod");
    }
}

public class Nested_Interface_DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterfaceAImplementation implementation = new NestedInterfaceAImplementation();
        implementation.nestedMethod();

	}

}
