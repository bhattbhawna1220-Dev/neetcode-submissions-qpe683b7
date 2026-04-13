class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";

        HashMap<Character,Integer> mapt= new HashMap<>();

        for(char c : t.toCharArray()){
            mapt.put(c,mapt.getOrDefault(c,0)+1);
        }

        int[] res ={-1,-1};
        int resLen = Integer.MAX_VALUE;

        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> maps= new HashMap<>();
            for(int j=i;j<s.length();j++){
                maps.put(s.charAt(j),maps.getOrDefault(s.charAt(j),0)+1);

                boolean flag = true ; 
                for(char c : mapt.keySet()){
                    if(maps.getOrDefault(c,0)<mapt.get(c)){
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (j - i + 1 < resLen) {
                        res[0] = i;
                        res[1] = j;
                        resLen = j - i + 1;
                    }
                }

            }
        }

       return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
        
    }
}
