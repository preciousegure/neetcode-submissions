class Solution {
    public boolean isAnagram(String s, String t) {
        char charArray1[] = s.toCharArray();
        char charArray2[] = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)){
            return true;
        }
        return false;
    }
}
