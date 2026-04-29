class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //make sure input is valid
        List<List<String>> groupedAnagrams = new ArrayList<>();
        if(strs == null || strs.length == 0) return groupedAnagrams;
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for(int index = 0; index < strs.length; index++){
            String currentStr = strs[index];
            char [] strToChArr = currentStr.toCharArray();
            Arrays.sort(strToChArr);
            String key = String.valueOf(strToChArr);
            // if(!anagramsMap.containsKey(key)){
            //     anagramsMap.put(key, new ArrayList<>());
            // }
            // anagramsMap.get(key).add(currentStr);
            anagramsMap.computeIfAbsent(key, k -> new ArrayList<>()).add(currentStr);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}