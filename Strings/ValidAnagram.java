package Strings;

import java.util.HashMap;

public class ValidAnagram {


    //1 brute force can  be maintaining a count array count[26] for each character , loop through s to increase count and
    // loop through t to decrease count , at the end check if value !=0

    //2
    public boolean isValidAnagram(String s, String t) {
        //maintain a hashset to keep count of chars in string s

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i< s.length();i++){

            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1); // if occuring first time then 0 , otherwise map.get+!
        }

        for(int i=0;i<t.length();i++) {

            char ch = t.charAt(i);

            if(map.get(ch)!=null){
                if(map.get(ch) ==1) {
                    map.remove(ch);
                }else {
                    map.put(ch, map.get(ch)-1);
                }

            }else return false;
        }




        return map.isEmpty();
    }


    public static void main(String args[]) {


        ValidAnagram validAnagram = new ValidAnagram();

        System.out.println(validAnagram.isValidAnagram("anagram", "nagaram"));


    }
}
