package Nested_Elements;

public class Nested_enums_example_class {

	 public enum InnerEnum {
	        VALUE1("First Value"),
	        VALUE2("Second Value"),
	        VALUE3("Third Value");
	        
	        private String description;
	        
	        private InnerEnum(String description) {
	            this.description = description;
	        }
	        
	        public String getDescription() {
	            return description;
	        }
	    }
	 public static void main(String[] args) {
	        // Using nested enum constants and method
	        InnerEnum enumValue = InnerEnum.VALUE3;
	        System.out.println("Nested enum value: " + enumValue);
	        System.out.println("Description: " + enumValue.getDescription());
	    }
}
