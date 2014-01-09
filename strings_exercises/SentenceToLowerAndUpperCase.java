// given a sentence, outputs it in lower then upper case

import java.util.*;

public class SentenceToLowerAndUpperCase {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in);

        System.out.println( "Enter the sentence to display in all lower, then upper case" );
        String sentence = in.nextLine();

        String sentenceInLower = sentence.toLowerCase();
        String sentenceInUpper = sentence.toUpperCase();

        System.out.println( "The sentence in lower case is: " + sentenceInLower );
        System.out.println( "The sentence in upper case is: " + sentenceInUpper );
    }
}
