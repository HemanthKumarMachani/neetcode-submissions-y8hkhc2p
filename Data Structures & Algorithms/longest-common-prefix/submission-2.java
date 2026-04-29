class Solution {
    public String longestCommonPrefix(String[] strs) {
        //make sure input is valid
        if(strs == null || strs.length == 0) return "";
        String longestCommonPrefix = strs[0];
        for(int index = 1; index < strs.length; index++){
            while(!strs[index].startsWith(longestCommonPrefix)){
                longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length()-1);
            }
        }
        return longestCommonPrefix;
    }
}