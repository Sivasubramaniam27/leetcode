class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int v=x;
        while(v>0){
            r=r*10+v%10;
            v/=10;
        }
        if(x==r){
            return true;
        }
        else{
        return false;
        }
    }
}
