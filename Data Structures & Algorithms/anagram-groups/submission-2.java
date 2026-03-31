//import java.util.function.BiPredicate;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String , List<String>> result = new HashMap<>();
       for( String item : strs){
           char[] c = item.toCharArray();
           Arrays.sort(c);
           String key = new String(c);
           if(!result.containsKey(key)){
              result.put(key,new ArrayList<>());
           }
         result.get(key).add(item);
       }
      return   new ArrayList<>(result.values());

    /***    List<List<String>> res = new ArrayList<List<String>>();
        boolean[] visited = new boolean[strs.length];
        java.util.function.BiPredicate<String,String> isAna = (s1,s2)->
        {
            if(s1.length()!=s2.length()) return false;
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
        };

        int lenstrs = strs.length;
        for( int i =0;i<strs.length;i++){
            if (visited[i]) continue;
            List<String> group = new ArrayList<String>();
            group.add(strs[i]);
            visited[i] = true; 

            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && isAna.test(strs[i],strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }

            res.add(group);
        }
        return res;
    ***/
    }


    }

