class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> set1 = new HashMap<>();
        for (char c : s.toCharArray()) {
            set1.put(c, set1.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> set2 = new HashMap<>();
        for (char p : t.toCharArray()) {
            set2.put(p, set2.getOrDefault(p, 0) + 1);
        }
        if (set1.equals(set2)) {
            return true;
        }else{
            return false;
        }
       
    }
}
