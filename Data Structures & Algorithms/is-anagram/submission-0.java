class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Boolean flag = true; 
        char[] str = s.toCharArray();
        char[] trp = t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(trp);

        for(int i = 0; i < str.length; i++){
            if(str[i] != trp[i]){
                flag = false;
                break;
            }
        }

        return flag;
        
    }
}
