class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
    for (int r = 0; r < strs[0].length() ; r++){
        char c = strs[0].charAt(r);
        for (int s = 1; s < strs.length; s ++) {
            if ( r == strs[s].length() || strs[s].charAt(r) != c)
                return strs[0].substring(0, r);             
        }
    }
    return strs[0];
    }
}
