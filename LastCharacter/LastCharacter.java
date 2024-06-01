public class LastCharacter{
    public static void main(String[] args) {
        // Input string
        String input = "Hey3 Java   Learners";
        
        // Call the method to get the last characters
        String result = getLastCharacters(input);
        
        // Print the result
        System.out.println(result);
    }

    public static String getLastCharacters(String input) {
        // Remove all digits and whitespace characters from the input string
        String cleanInput = input.replaceAll("[\\d\\s]", "");

        // StringBuilder to collect the result
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the cleaned input string
        for (int i = 0; i < cleanInput.length(); i++) {
            char currentChar = cleanInput.charAt(i);
            // Check if the current character is the last character of a word
            if (i == cleanInput.length() - 1 || cleanInput.charAt(i + 1) == ' ') {
                // Append the last character to the result
                result.append(currentChar);
            }
        }

        // Return the final result as a string
        return result.toString();
    }
}
