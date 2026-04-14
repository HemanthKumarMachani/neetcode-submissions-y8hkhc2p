class Solution {
    public boolean isAnagram(String s, String t) {
        //make sure given input is correct
        if(s == null || t == null || s.length() != t.length()) return false;
        Map<Character,Integer> charactersCountMap = new HashMap<>();
        for( int index = 0; index< s.length(); index++){
            char sChar = s.charAt(index);
            char tChar = t.charAt(index);
            charactersCountMap.put(sChar, charactersCountMap.getOrDefault(sChar,0)+1);
            charactersCountMap.put(tChar, charactersCountMap.getOrDefault(tChar,0)-1);
        }
        for(int count : charactersCountMap.values()){
            if(count != 0) return false;
        }
        return true;
    }
}
