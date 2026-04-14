class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) return "";
        //assume first string as the prefix and we'll compare with the next string, reduce the first till
        //the prefix match and move to the next till the end of the array. By the end of the pass we'll have
        //the longest prefix.
        String prefix = strs[0];
        for(int index = 1; index< strs.length; index++){
            String currentStr = strs[index];
            while(!currentStr.startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}