public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        // Split sentence into individual words by space character
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        // Iterate every word in word array
        for(String word : words){
            // Reverse character sequence inside single word
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            // Append reversed word and space to final output
            result.append(reversedWord).append(" ");
        }

        System.out.println("Original: " + sentence);
        System.out.println("Reversed each word: " + result.toString().trim());
    }
}
