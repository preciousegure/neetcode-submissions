class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       if(ransomNote.length() > magazine.length()){
        return false;
       } 
       int[] charCount = new int[26];

       for(int i = 0; i < magazine.length(); i++){
        char current = magazine.charAt(i);
        charCount[current - 'a']++;
       }
       for(int j = 0; j < ransomNote.length(); j++){
        char current = ransomNote.charAt(j);
        if (charCount[current - 'a'] == 0){
            return false;
        }
        charCount[current - 'a'] --;
       }
       return true;
    }
}