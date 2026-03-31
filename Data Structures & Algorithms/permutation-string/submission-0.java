class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        String sorteds1 = new String(a1);

        for(int i =0; i< s2.length();i++){
            for(int j=i;j<s2.length();j++){
                char[] subseq = s2.substring(i,j+1).toCharArray();  
                Arrays.sort(subseq);
                String sortedsubseq = new String(subseq);

                if(sortedsubseq.equals(sorteds1)){
                    return true;
                }
            }

        }
        return false;
        
    }
}
