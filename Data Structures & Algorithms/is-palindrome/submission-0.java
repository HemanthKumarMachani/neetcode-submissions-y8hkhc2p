class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int index = s.length()-1; index >= 0; index--){
            if(Character.isLetterOrDigit(s.charAt(index))){
                sb.append(Character.toLowerCase(s.charAt(index)));
            }
        }

        return sb.toString().equals(sb.reverse().toString());
    }
}
