public class SmallestVowel {
	    public static void main(String[] args) {
	        // Input string
	        String input = "matrix";

	        // Call the method to print the smallest vowel
	        char smallestVowel = findSmallestVowel(input);
	        
	        // Print the smallest vowel
	        System.out.println(smallestVowel);
	    }

	    public static char findSmallestVowel(String input) {
	        // Convert the input string to lowercase for case-insensitive comparison
	        input = input.toLowerCase();

	        // Initialize the smallest vowel as 'z' (maximum value)
	        char smallestVowel = 'z';

	        // Iterate through each character in the input string
	        for (char ch : input.toCharArray()) {
	            // Check if the character is a vowel and smaller than the current smallest vowel
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                smallestVowel = (char) Math.min(smallestVowel, ch);
	            }
	        }

	        // Return the smallest vowel found
	        return smallestVowel;
	    }
	}

