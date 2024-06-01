import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class UniqueCharacters {
		    public static void main(String[] args) {
	        // Input string
	        String input = "xperience";
	        
	        // Call the method to print unique characters
	        printUniqueCharacters(input);
	    }

	    public static void printUniqueCharacters(String input) {
	        // Convert the input string to lowercase
	        input = input.toLowerCase();

	        // Set to store unique characters while maintaining insertion order
	        Set<Character> uniqueCharacters = new LinkedHashSet<>();

	        // Iterate through each character in the input string
	        for (char ch : input.toCharArray()) {
	            // Add the character to the set if it's not already present
	            uniqueCharacters.add(ch);
	        }

	        // Print the unique characters
	        for (char ch : uniqueCharacters) {
	            System.out.print(ch);
	        }
	    }
	}

