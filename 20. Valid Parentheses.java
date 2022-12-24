class Solution {
    public boolean isValid(String a) {
         HashMap<Character, Character> match = new HashMap<Character, Character>();
        match.put(')','(');
        match.put('}','{');
        match.put(']','[');
        Stack<Character> stack = new Stack<Character>();
        for (int r= 0; r < a.length(); r++){
            if (a.charAt(r) == '(' || a.charAt(r) == '{' || a.charAt(r) == '[') {
                stack.push(a.charAt(r));
                continue;
            }
            if (stack.size() == 0 || match.get(a.charAt(r)) != stack.pop()) {
                return false;
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
        
    }
}
