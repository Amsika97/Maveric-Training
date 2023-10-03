package Nested_Elements;

public class Nested_enums_example_enums {

	// Outer enum
    public enum OuterEnum {
        VALUE1,
        VALUE2,
        VALUE3;
        
        // Inner enum
        public enum InnerEnum {
            SUBVALUE1,
            SUBVALUE2,
            SUBVALUE3
        }
    }
    
    public static void main(String[] args) {
        // Using outer enum constant
        OuterEnum outerValue = OuterEnum.VALUE2;
        System.out.println("Outer enum value: " + outerValue);
        
        // Using inner enum constant
        OuterEnum.InnerEnum innerValue = OuterEnum.InnerEnum.SUBVALUE3;
        System.out.println("Inner enum value: " + innerValue);
    }
}
