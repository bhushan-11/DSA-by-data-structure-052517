package Strings;

import java.util.HashSet;
import java.util.Set;

public class LSWRC_Longest_substring {

    public int lengthOfLongestSubstring(String s) {
        int left = 0 ;
        int right = 0;
        int maxLenght = 0 ;

        Set<Character> charSet = new HashSet<>();
        int n= s.length();
        for(right =0 ; right < n; right ++ ) {

            if(!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLenght = Math.max(maxLenght, right-left+1);
            } else {
                charSet.remove(left);
                left ++;
            }

            /*while(s.charSet.contains(s.charAt(right) {
            charset.remove(s,charAt(left);
            left ++
            }
            s
             */


        }

        return maxLenght;
    }

    public static void main (String args[]) {

        LSWRC_Longest_substring lswrc_longest_substring = new LSWRC_Longest_substring();

        int result  = lswrc_longest_substring.lengthOfLongestSubstring("abcabccbb");

        System.out.println("the result is " + result);




    }
}
