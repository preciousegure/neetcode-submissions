class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] frequencies = new int[26];

        for(int i = 0; i < s.length(); i++){
            frequencies[s.charAt(i) - 'a']++;
            frequencies[t.charAt(i) - 'a']--;
        }

        for(int frequency : frequencies){
            if (frequency != 0){
                return false;
            }
        }
        return true;
    }
}
