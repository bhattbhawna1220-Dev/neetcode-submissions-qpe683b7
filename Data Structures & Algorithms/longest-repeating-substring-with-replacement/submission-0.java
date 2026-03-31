class Solution {
    public int characterReplacement(String s, int k) {
        int len = s.length();
        int res =0; 
        for(int i =0; i< len;i++){

            HashMap<Character,Integer> map = new HashMap<>();
            int max =0;
            for(int j=i;j<len;j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                max = Math.max(max,map.get(s.charAt(j)));

                if((j-i+1)-max <=k){
                    res = Math.max(res, j-i+1);
                }
            }


        }
        return res; 

    }
}
