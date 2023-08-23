package Module1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExtraAct2 {

    private final List<Character> alphabets;
    public ExtraAct2(){
        alphabets = new ArrayList<Character>();

        for (int i = 65; i <= 90; i++) {
            alphabets.add((char)i);
        }
    }

    private List<Character> getAlphabetMap(){
        return this.alphabets;
    }

    private List<Character> fit(String input){

        List<Character> fittedInput = new ArrayList<Character>();

        for (int i = 0; i < input.length(); i++) {
            if((int) input.charAt(i) == 32){
                continue;
            }
            fittedInput.add(input.charAt(i));
        }
        return fittedInput;
    }

    private List<HashMap<Character, Integer>> count(List<Character> input){

        List<HashMap<Character, Integer>> counted = new ArrayList<HashMap<Character, Integer>>();

        for (int i = 0; i < getAlphabetMap().size(); i++) {

            int charCount = 0;

            for (Character character : input) {
                if (getAlphabetMap().get(i).equals(character)) {
                    charCount++;
                }
            }

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            map.put(getAlphabetMap().get(i), charCount);
            counted.add(i, map);
        }
        return counted;
    }

    private void printCounted(List<HashMap<Character, Integer>> counted){

        for (int i = 0; i < counted.size(); i++) {
            char alphabetLetter = getAlphabetMap().get(i);
            System.out.println("[" + alphabetLetter +"] - " + counted.get(i).get(alphabetLetter));
        }

    }

    public void run(){
        
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = inputScanner.nextLine();

        List<HashMap<Character, Integer>> counted = count(fit(input.toUpperCase()));

        printCounted(counted);

    }

}
