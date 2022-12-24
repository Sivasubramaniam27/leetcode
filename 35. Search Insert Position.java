class Solution {
    public int searchInsert(int[] n, int t) {
        int r = 0;
        
        if(n.length==1 && t>n[0]){
            return 1;
        }
        
        for(int i=0;i<n.length-1;i++){
            if(t == n[i]){
                r =  i;
                break;
            }else if(t>n[i] && t<=n[i+1]){
                r = i+1;
                break;
            }else if(t>n[i+1] && (n.length-1==i+1)){
                r= n.length;
                break;
            }else if(t<n[i] && i==0){
                r =  0;
                break;
            }else if(t>n[i] && t>n[i+1]){
                continue;
            }
        }
        
        return r;
        
    }
}
