public class VowelsConsonantsCount {
	    public static void main(String[] args) {
	        // Input string
	        String input = "Hello World!";
	        
	        // Call the method to count vowels and consonants
	        countVowelsAndConsonants(input);
	    }

	    public static void countVowelsAndConsonants(String input) {
	        // Convert the input string to lowercase to simplify comparison
	        input = input.toLowerCase();

	        // Initialize counters for vowels and consonants
	        int vowelsCount = 0;
	        int consonantsCount = 0;

	        // Iterate through each character in the input string
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is an alphabet
	            if (Character.isLetter(ch)) {
	                // Increment the corresponding counter based on whether it's a vowel or consonant
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelsCount++;
	                } else {
	                    consonantsCount++;
	                }
	            }
	        }

	        // Print the counts
	        System.out.println("Vowels count - " + vowelsCount);
	        System.out.println("Consonants count - " + consonantsCount);
	    }
	}

