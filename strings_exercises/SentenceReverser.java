//Application displays a sentence with its words reversed
import java.util.*;

public class SentenceReverser {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        System.out.println( "Enter a sentence to reverse (individual words not reversed):");
        
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");
        
        System.out.println( "The sentence reversed is:");
        for (int i = words.length -1; i >= 0 ; i--)
            System.out.print( words[i] + " ");
        
        System.out.println();
    }
}
