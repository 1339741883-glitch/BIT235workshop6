public class MessageDecode {
    public static void main(String[] args) {
        // Coded input message, can be modified easily
        String codedMsg = "G tgsl Qefe.";

        StringBuilder decoded = new StringBuilder();
        // Traverse every character in coded message
        for(int i=0; i < codedMsg.length(); i++){
            char c = codedMsg.charAt(i);
            // Only decode alphabet letters, ignore punctuation and space
            if(Character.isLetter(c)){
                // Modify this logic to match your assignment decode table
                c = (char)(c -1);
            }
            decoded.append(c);
        }

        System.out.println("Coded message: " + codedMsg);
        System.out.println("Decoded message: " + decoded.toString());
    }
}
