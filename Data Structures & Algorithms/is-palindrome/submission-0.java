class Solution {
    public boolean isPalindrome(String s) {
    String str = s.replaceAll("[^a-zA-Z0-9]", "");  
    str = str.replaceAll("//s",""); 
    str  = str.toLowerCase();
    System.out.println(str); 
    StringBuilder sb = new StringBuilder(str);
    return str.equals(sb.reverse().toString());
    }
}
