package assignment;

import java.util.*;

public class Assignment6_String {
    public static void main(String[] args) {
        Q1RemoveAllWhiteSpace("Welcome to Java Training batch");
        Q2ReplaceLowToUpAndUpToLow("Welcome to Java Training batch");
        Q3ReplaceWhiteSpaceWithACharacter("Welcome to Java Training batch",'X');
        Q4CountTotalCharactersInString("Welcome to Java Training batch");
        Q5CheckPalindrome("abba");
        Q6FindMaxAndMinOccurringCharacters("Welcome to Java Training batch");
        Q7ReverseString("Welcome to Java Training batch");
        Q8FindDuplicateCharacters("Welcome to Java Training batch");
        Q9FindDuplicateWords("orange apple, banana + banana grape + watermelon apple tomato banana orange");
        Q10FindFrequencyOfCharacters("Welcome to Java Training batch");
        Q11FindLongestAndShortestWord("Welcome to Java Training batch of VSoft");
        Q12SwapTwoStringWithoutTempVariable("Hello","World");
        Q13GetTheCharacterAtTheGivenIndex("Welcome to Java Training batch", 9);
        Q14ReplaceAlldWithf("did you just daydreaming?");
        Q15FindSecondMostFrequentCharacter("Welcome to Java Training batch");
        Q16RemoveDuplicatesThenPrint("Welcome to Java Training batch");
    }

    static void Q1RemoveAllWhiteSpace(String input){
        String newString = input.replace(" ", "");
        System.out.println("Q1. '"+ input + "' -> '" + newString+"'");
    }
    static void Q2ReplaceLowToUpAndUpToLow(String input){
        String newString = "";
        for(char ch : input.toCharArray()){
            boolean isLower = Character.isLowerCase(ch);
            ch = (isLower == true)? Character.toUpperCase(ch): Character.toLowerCase(ch);
            newString += ch;
        }
        System.out.println("Q2. '"+ input + "' -> '" + newString+"'");
    }

    static void Q3ReplaceWhiteSpaceWithACharacter(String input, char replacement){
        String newString = input.replace(' ', replacement);
        System.out.println("Q3. '"+ input + "' -> '" + newString+"'");

    }
    static void Q4CountTotalCharactersInString(String input){
        System.out.println("Q4. '"+ input + "' -> has " + input.length()+" characters");
    }

    static void Q5CheckPalindrome(String input){
        int len = input.length();
        boolean isPalindrome = true;
        for(int i = 0; i < len/2; i++){
            if(input.charAt(i) != input.charAt(len-i-1)){
                isPalindrome = false;
            }
        }
        String message = (isPalindrome) ? "is Palindrome" : "is not Palindrome";
        System.out.println("Q5. '"+ input + "' -> " + message);
    }

    static void Q6FindMaxAndMinOccurringCharacters(String input){
        int maxOccur = 0;
        int minOccur = 0;
        String maxChars = "";
        String minChars = "";
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != ' '){
                char charPointer = input.charAt(i);
                int CountPointer = 0;
                for(int j = 0; j < input.length(); j++){
                    if(charPointer == input.charAt(j)){
                        CountPointer++;
                    }
                }
                if(maxOccur < CountPointer){
                    maxOccur = CountPointer;
                    maxChars = input.charAt(i) +" ";
                }else if (maxOccur == CountPointer){
                    if(maxChars.indexOf(input.charAt(i)) < 0){
                        maxChars += input.charAt(i) + " ";
                    }
                }
                if(minOccur == 0){
                    minOccur = CountPointer;
                }else {
                    if(minOccur > CountPointer){
                        minOccur = CountPointer;
                        minChars = input.charAt(i)+ " ";
                    }else if (minOccur == CountPointer){
                        if(minChars.indexOf(input.charAt(i)) < 0){
                            minChars += input.charAt(i) + " ";
                        }

                    }
                }
            }
        }

        System.out.println("Q6. '"+ input + "' -> Max: " + maxChars + "[" +maxOccur+"]" + " - Min: " + minChars + "[" +minOccur+"]");

    }

    static void Q7ReverseString(String input){
        String _newString = "";
        for(int i = input.length()-1; i >= 0; i--){
            _newString += input.charAt(i);
        }
        System.out.println("Q7. '"+ input + "' -> '" + _newString+"'");
    }

    static void Q8FindDuplicateCharacters(String input){
        char[] chs = input.toCharArray();
        Arrays.sort(chs);
        int count = 1;
        char chPointer = chs[0];
        String duplicateCharacter = "";
        for(int i = 1; i < chs.length; i++){
            if(chPointer == chs[i]){
                count++;
            }else {
                if(count == 2){
                    duplicateCharacter += chPointer + " ";
                }
                count = 1;
                chPointer = chs[i];
            }
        }

        System.out.println("Q8. '"+ input + "' -> Duplicate Characters [" + duplicateCharacter+"]");
    }

    static void Q9FindDuplicateWords(String input){
        String[] words = input.split("\\W");
        Arrays.sort(words);
        int count = 1;
        String chPointer = words[0];
        String duplicateCharacter = "";
        for(int i = 1; i < words.length; i++){
            if(chPointer.equals(words[i])){
                count++;
            }else {
                if(count == 2){
                    duplicateCharacter += chPointer + " ";
                }
                count = 1;
                chPointer = words[i];
            }
        }

        System.out.println("Q9. '"+ input + "' -> Duplicate Words [" + duplicateCharacter+"]");
    }

    static void Q10FindFrequencyOfCharacters(String input){
        String _newString = input.replaceAll("\\W","");
        char[] chs = _newString.toCharArray();
        Arrays.sort(chs);

        int count = 0;
        char chPointer = chs[0];
        String message = "";

        for(char c : chs){
            if(c == chPointer){
                count++;
            }else{
                message += chPointer + "[" + count+"] ";
                chPointer = c;
                count = 1;
            }
        }

        System.out.println("Q10. '"+ input + "' -> Frequency of Characters [ " + message+"]");
    }

    static void Q11FindLongestAndShortestWord(String input){
        String[] words = input.split("\\W");
        String longestWords = "";
        String shortestWords = "";
        String longestWord = "";
        String shortestWord = "";
        for(String s : words){

            if(s.length() > longestWord.length()){
                longestWord = s;
                longestWords = s;
            }else if(s.length() == longestWord.length()){
                longestWords += ", " + s;
            }

            if(shortestWord.equals("")){
                shortestWord = s;
                shortestWords = s;
            }else {
                if(s.length() < shortestWord.length()){
                    shortestWord = s;
                    shortestWords = s;
                }else if(s.length() == shortestWord.length()){
                    shortestWords += ", " + s;
                }
            }
        }

        System.out.println("Q11. '"+ input + "' -> Longest Words: [ " + longestWords+" ] - Shortest Words: [ "+shortestWords+" ]");
    }

    static void Q12SwapTwoStringWithoutTempVariable(String input1, String input2){
        System.out.print("Q12. '"+ input1 + " " + input2);
        input1 += input2;
        input2 = input1.substring(0, input1.length() - input2.length());
        input1 = input1.substring(input2.length());
        System.out.println("' -> '"+ input1 + " "+ input2+"'");
    }

    static void Q13GetTheCharacterAtTheGivenIndex(String input, int index){
        System.out.println("Q13. '"+ input + "' -> Character at index " + index +" is '"+ input.charAt(index)+"'");
    }

    static void Q14ReplaceAlldWithf(String input){
        System.out.println("Q14. '"+ input + "' -> '" + input.replace('d','f') +"'");

    }
    static void Q15FindSecondMostFrequentCharacter(String input){
        char[] chs = input.toCharArray();
        Arrays.sort(chs);
        Dictionary<Character, Integer> dict = new Hashtable<>();
        int max = 0;
        int second = 0;
        String mostSecondWords = "";
        for(char c : chs){
            if(c != ' '){
                if(dict.get(c) != null){
                    dict.put(c, dict.get(c) + 1);
                    if(dict.get(c) > max){
                        max = dict.get(c);
                    }else{
                        if(dict.get(c) >= second & second < max){
                            if(dict.get(c) > second){
                                second = dict.get(c);
                                mostSecondWords = c+"";
                            }else if (dict.get(c) == second){
                                mostSecondWords += ", " + c;
                            }

                        }
                    }
                }else {
                    dict.put(c, 1);
                }
            }
        }

        System.out.println("Q15. '"+ input + "' -> Second Most Frequent Character(s): [" + mostSecondWords +"]["+second+"]");
    }

    static void Q16RemoveDuplicatesThenPrint(String input){
        char[] chs = input.toCharArray();
        String newString = input;

        for(int i = 0; i < input.length(); i++){
            if(chs[i] != ' '){
                int counter = 0;
                for (int j = 0; j < input.length(); j++) {
                    if(chs[i] == chs[j]){
                        counter++;
                    }
                }
                if(counter == 2){
                    newString = newString.replace(chs[i]+"","");
                }

            }
        }

        System.out.println("Q16. '"+ input + "' -> '" + newString +"'");
    }
}
