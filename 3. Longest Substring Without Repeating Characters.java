class Solution {
    public int lengthOfLongestSubstring(String r) {
         int a = 0;
         int b = 0;
        int max = 0; 
        
        HashSet<Character> set = new HashSet();
        
        while(b < r.length()){
            if (!set.contains(r.charAt(b))){
                set.add(r.charAt(b));
                b++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(r.charAt(a));
                a++;
            }
        }
        
        return max;
    }
}
