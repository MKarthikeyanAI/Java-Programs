package zoho_round2_questions;

/*
3. It's about anagram.i/p was array of strings.
and a word was given to find whether it has anagram in given array. l/p catch, got, tiger, mat, eat, Pat, tap, tea.
 */
import java.util.*;
public class anagram {
    List<String> findAnagrams(String[] words,String word){
        List<String> anagrams = new ArrayList<>();
        char[] targetChars = word.toLowerCase().toCharArray();
        Arrays.sort(targetChars);
        for(String w:words){
            if(w.length()!= word.length())
            {
                continue;
            }
            char[] chars = w.toLowerCase().toCharArray();
            Arrays.sort(chars);

            if(Arrays.equals(chars,targetChars)){
                anagrams.add(w);
            }
        }
        return anagrams;
    }
    public static void main(String[] args) {
        anagram anagramFinder = new anagram();

        String[] words = {"listen", "silent", "enlist", "hello", "world", "rat", "tar", "art"};
        String wordToFindAnagramsFor = "rat";

        List<String> anagrams = anagramFinder.findAnagrams(words, wordToFindAnagramsFor);

        System.out.println("Anagrams of '" + wordToFindAnagramsFor + "': " + anagrams);
    }
}
