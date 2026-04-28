class Solution {
    public boolean isAnagram(String s, String t) {
        //make sure input is valid
        if(s == null || t == null || s.length() != t.length()) return false;
        int [] freq = new int [26];
        for(int index = 0; index < s.length(); index++){
            freq[s.charAt(index) - 'a']++;
            freq[t.charAt(index) - 'a']--;
        }
        for(int it = 0; it < freq.length; it++){
            if(freq[it] != 0) return false;
        }
        return true;
    }
}
