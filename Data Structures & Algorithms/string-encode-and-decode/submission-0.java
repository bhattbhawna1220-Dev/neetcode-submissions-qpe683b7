class Solution {

    public String encode(List<String> strs) {
     if(strs.isEmpty()) return "";
     StringBuilder encodedString = new StringBuilder();
     List<Integer> encode = new ArrayList<>(); 
     for(String str : strs){
        encode.add(str.length());
     }
     System.out.println(encode.toString());
     for(int en : encode){
        encodedString.append(en).append(',');
     }
     System.out.println(encode.toString());
     encodedString.append('#');
     for(String str : strs){
        encodedString.append(str);
     }
     System.out.println(encodedString.toString());
     return encodedString.toString();

    }

    public List<String> decode(String str) {
       if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}
