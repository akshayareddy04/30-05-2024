public class SpaceAndCharacterCount {
	    public static void main(String[] args) {
	        // Input string
	        String input = "Hello This is ABCD from XYZ city";

	        // Call the method to compute spaces and characters
	        computeSpacesAndCharacters(input);
	    }

	    public static void computeSpacesAndCharacters(String input) {
	        // Remove digits from the input string
	        String cleanedInput = input.replaceAll("\\d", "");

	        // Count spaces and characters
	        int spacesCount = 0;
	        int charactersCount = 0;

	        // Iterate through each character in the cleaned input string
	        for (char ch : cleanedInput.toCharArray()) {
	            if (ch == ' ') {
	                // Increment spaces count if the character is a space
	                spacesCount++;
	            } else {
	                // Increment characters count for non-space characters
	                charactersCount++;
	            }
	        }

	        // Print the counts
	        System.out.println("No of spaces : " + spacesCount );
	        System.out.println("No of characters: " + charactersCount);
	    }
	}

