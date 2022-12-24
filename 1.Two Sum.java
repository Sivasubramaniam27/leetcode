class Solution {
    public int[] twoSum(int[] num, int target) {
        for(int a=0;a<num.length;a++){
            for(int b=a+1;b<num.length;b++){
            if(num[a]+num[b]==target){
                return new int[]{a,b};
            }
        }
      }
        return null;
    }
}
