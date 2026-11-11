public class SearchEngineDemo {
    public static void main(String[] args) {
        // Create string array stores 10 given paragraphs
        String[] paragraphs = new String[10];
        paragraphs[0]="Lose all the weight you want.";
        paragraphs[1]="I can't I must work";
        paragraphs[2]="That would be like a keyword search.";
        paragraphs[3]="This would be Victoria.";
        paragraphs[4]="Join the party.";
        paragraphs[5]="To be or not to be.";
        paragraphs[6]="That is a question to test keyword search.";
        paragraphs[7]="Can you find a needle in a hay stack?";
        paragraphs[8]="This could be the last paragraph, but its not.";
        paragraphs[9]="Ada Lovelace is the worlds first programmer as of 1860.";

        // Target search phrase, can be changed for different test
        String searchPhrase = "search";

        boolean foundAny = false;
        System.out.println("Searching for phrase: \"" + searchPhrase + "\"");
        // Loop through all paragraphs for keyword matching
        for(int i=0; i < paragraphs.length; i++){
            if(paragraphs[i].contains(searchPhrase)){
                System.out.println("----Found at index " + i + " ----");
                System.out.println(paragraphs[i]);
                foundAny = true;
            }
        }
        // Print prompt message if no matching paragraph found
        if(!foundAny){
            System.out.println("The search phrase was NOT found in any paragraph.");
        }
    }
}
