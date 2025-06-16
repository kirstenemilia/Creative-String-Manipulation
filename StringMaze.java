import java.util.Scanner;

public class StringMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to StringMaze: The Text Escape Rooms");
        System.out.println("Solve the puzzles by providing the correct answers to proceed.");
        System.out.println("Type 'help' for instructions. Let's begin!\n");

        // Puzzle 1 - Reversed Message
        String room1 = "e p a c s e   r u o y   n o   s e h s i w   t s e B";
        System.out.println("You enter the first room. On the wall, you see:");
        System.out.println(room1);

        // Pre-calculate the correct reversed message to compare to user answer
        String correctReversedMessage = "best wishes on your escape"; // Stored in lowercase for case insensitive comparison

        System.out.println("\nType the correctly reversed message:"); 
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase(); // Convert user input to lowercase

            if (input.equals(correctReversedMessage)) { // Check if user input matches the correct reversed message
                System.out.println("\n✅ The message now reads:\n");
                System.out.println("    " + correctReversedMessage.substring(0, 1).toUpperCase() + correctReversedMessage.substring(1) + "\n"); // Display with proper capitalization
                break;
            } else if (input.equals("help")) {
                System.out.println("Hint: Read the message backwards to find the correct phrase.");
            } else {
                System.out.println("That's not quite right. Try again or type 'help'.");
            }
        }

        // Puzzle 2 - Replace vowels 
        System.out.println("Next room: The door has a code:");
        String code = "r3p14c3@ll_th3_V0w3l$";
        System.out.println(code);
        System.out.println("\nWhat is the strange message trying to say?:");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("replace the vowels")) {
                System.out.println("\n✅ Code accepted. Door opens.\n");
                break;
            } else if (input.equals("help")) {
                System.out.println("Hint: Figure out what the message is telling you.");
            } else {
                System.out.println("Incorrect answer. Try again or type 'help'.");
            }
        }

        // Puzzle 3 - ASCII decoder
        System.out.println("You find a note with ASCII codes separated by spaces:");
        // ASCII values for the word 'Encapsulation'
        String asciiMessage = "69 110 99 97 112 115 117 108 97 116 105 111 110";
        System.out.println(asciiMessage);

        // Pre-calculate the correct decoded message for comparison
        StringBuilder correctDecodedBuilder = new StringBuilder();
        String[] codes = asciiMessage.split(" ");
        for (String codeStr : codes) {
            try {
                int codeNum = Integer.parseInt(codeStr);
                correctDecodedBuilder.append((char) codeNum);
            } catch (NumberFormatException e) {
                // Shouldn't happen with current fixed string, but good practice
                System.out.println("Internal Error: Could not pre-decode ASCII message.");
                correctDecodedBuilder.setLength(0); // Clear in case of an error
                break;
            }
        }
        // Convert to lowercase for case insensitive comparison with user input
        String correctDecodedMessage = correctDecodedBuilder.toString().toLowerCase();

        System.out.println("\nType the secret message to proceed:"); 

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals(correctDecodedMessage)) { // Check if user input matches decoded message
                System.out.println("\n✅ Decoded message accepted. You found the secret!\n");
                break;
            } else if (input.equals("help")) {
                System.out.println("Hint: Convert the ASCII codes to characters to reveal the message.");
            } else {
                System.out.println("That's not quite right. Try again or type 'help'."); // Another error msg
            }
        }

        // Puzzle 4 - Hidden word puzzle 
        System.out.println("You notice certain letters capitalized strangely in a sentence:");
        String hiddenSentence = "Here Everyone Loves Loving Our Wonderful Old Red Lobster Davinci!"; 
        System.out.println(hiddenSentence);

        String correctHiddenWord = "hello world"; 

        System.out.println("\nType the hidden word to proceed:"); 

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase(); // Convert user input to lowercase for case insensitive comparison

            // Check if user input matches the correct hidden word ('hello world')
            if (input.equals(correctHiddenWord)) {
                System.out.println("\n✅ Hidden message found: " + correctHiddenWord.toUpperCase() + ". You found the secret!\n");
                break;
            } else if (input.equals("help")) {
                System.out.println("Hint: Look for capital letters that stand out. The answer includes a space!"); // Added hint 
            } else {
                System.out.println("That's not quite right. Try again or type 'help'."); // Error msg
            }
        }

        // Puzzle 5 - Palindrome portal
        System.out.println("You approach an enchanting portal. A message reads:");
        System.out.println("\"Type a palindrome word to activate me.\"");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("help")) {
                System.out.println("A palindrome reads the same forwards and backwards.");
            } else {
                String reversed = new StringBuilder(input).reverse().toString();
                if (input.equals(reversed) && input.length() > 0) {
                    System.out.println("\n✅ The portal glows brightly, granting you passage!\n");
                    break;
                } else {
                    System.out.println("That is not a palindrome. Try again or type 'help'.");
                }
            }
        }

        // Puzzle 6 - Unscramble sentence
        System.out.println("Final room: Unscramble this sentence:");
        String scrambled = "principle Java anywhere run is key Write a once of"; 
        System.out.println(scrambled);
        System.out.println("\nType the correctly ordered sentence:");

        String correctAnswer = "write once run anywhere is a key principle of java"; 

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals(correctAnswer)) {
                System.out.println("\n🎉 Congratulations! You've escaped the StringMaze!");
                break;
            } else if (input.equals("help")) {
                System.out.println("Try rearranging the words into a proper sentence about Java.");
            } else {
                System.out.println("That's not quite right. Try again or type 'help'.");
            }
        }

        scanner.close();
    }
}








