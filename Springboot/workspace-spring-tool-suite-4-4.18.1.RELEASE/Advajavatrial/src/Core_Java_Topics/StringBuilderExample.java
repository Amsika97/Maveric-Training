package Core_Java_Topics;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder stringBuilder = new StringBuilder();

        // Appending strings
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World!");
        
        String Stringbuilder1 = stringBuilder.toString();

        System.out.println(Stringbuilder1);

        // Inserting string at a specific position
        stringBuilder.insert(5, "Java ");
        
        String Stringbuilder2 = stringBuilder.toString();

        System.out.println(Stringbuilder2);

        // Replacing a substring
        stringBuilder.replace(6, 10, "is");
        
        String Stringbuilder3 = stringBuilder.toString();

        System.out.println(Stringbuilder3);

        // Deleting a substring
        stringBuilder.delete(11, 16);

        // Converting to string
        String finalString = stringBuilder.toString();

        System.out.println(finalString);

	}

}
