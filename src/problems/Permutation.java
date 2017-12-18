package problems;

import java.util.ArrayList;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {
    String s = "abc";
    char ch;
    ArrayList<Character> input = new ArrayList<Character>();


    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */


            String s = "abc";
            int count;
            char ch;
            ArrayList<Character> input = new ArrayList<Character>();
            for (int i=0; i < s.length(); i++)
            {
                ch = s.charAt(i);
                input.add(ch);
            }
        for (int i = 0; i <= input.size(); i++) {
                for (int j = 0; j < input.size(); j++) {
                    for (int k = 0; k < input.size(); k++) {
                        System.out.print(input.get(i));
                        System.out.print(input.get(j));
                        System.out.print(input.get(k));
                        System.out.println();
                    }
                }
            }
        }
    }
