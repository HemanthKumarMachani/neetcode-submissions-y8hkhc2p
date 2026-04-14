class Solution {

    public String encode(List<String> strs) {
        //make sure input is valid 
        if(strs == null || strs.size() == 0) return "";
        //String result = "";
        StringBuilder builder = new StringBuilder();
        for(String str : strs){
            builder.append(str.length()).append("#").append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int index = 0;
        while(index<str.length()){
        int slash = str.indexOf('#', index);
        int size = Integer.parseInt(str.substring(index,slash));
        index = slash +1;
        decodedStrings.add(str.substring(index,index+size));
        index +=size;
        }
        return decodedStrings;
    }
}
