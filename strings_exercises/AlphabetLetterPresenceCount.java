// counts and prints out the number of occurences of each letter of the alphabet in the sentence.
import java.util.*;

public class AlphabetLetterPresenceCount {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );

        System.out.println( "Enter a sentence, we will tell you how often each letter of the alphabet appears in it:");

        String sentence = in.nextLine();
        sentence = sentence.toLowerCase();
        
        int[] count = new int[26];

        for ( int i = 0; i < sentence.length(); i++ ) {
            if ( !Character.isLetter(sentence.charAt(i)) )          //characters not alphabet letters are ignored
                continue;           
            char charValue = sentence.charAt(i);
            int valueInAlphabet = charValue - 'a';
            ++count[valueInAlphabet];
        }

        System.out.println( "\nHere are the results:");
        
        for (int i = 0; i < 26; i++) {
            System.out.print( (char) ('a' + i) + ":" + "\t");
            System.out.println( count[i]);
        }
    }
}
