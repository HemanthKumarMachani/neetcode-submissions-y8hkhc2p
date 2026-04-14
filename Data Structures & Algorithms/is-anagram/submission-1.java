class Solution {
    public boolean isAnagram(String s, String t) {
        //make sure input is valid
        if(s == null || t == null || s.length() != t.length()) return false;
        //as the input contains only lower case aphabets, we can optimize it using a counter array to
        //where count at each index represents the frequency of that particular character index
        int [] counter = new int[26];
        for(int index = 0; index < s.length(); index++){
            // as we can see, valid anagram is possible only when the number of characters and frequency of
            // each character in both the inputs strings are same.
            //so by incrementing count for one and decementing the count for other, we can find if anagram or not
            counter[s.charAt(index) - 'a']++;
            counter[t.charAt(index) - 'a']--;
        }
        for(int count : counter){
            if(count != 0) return false;
        }
        return true;
    }
}
