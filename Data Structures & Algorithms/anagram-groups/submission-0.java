class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //input validation
        if(strs == null || strs.length == 0) return Collections.emptyList();
        //We'll covert each string in to char array, sort it and add it as a key in the map, if key already exists the we'll add it to the list.
        Map<String, List<String>> anagramsList = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String currentString = strs[i];
            char [] strToCharArr = currentString.toCharArray();
            Arrays.sort(strToCharArr);
            String key = String.valueOf(strToCharArr);
            if(!anagramsList.containsKey(key)){
                anagramsList.put(key, new ArrayList<>());
            }
            anagramsList.get(key).add(currentString);
        }
        return new ArrayList<>(anagramsList.values());
    }
}
