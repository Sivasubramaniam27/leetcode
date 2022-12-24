class Solution {
public:
    void rotate(vector<vector<int>>& mat) {
        int l= mat.size();
        for(int v=0;v<l;v++){
            for(int s=0;s<v;s++){
                swap(mat[v][s],mat[s][v]);
            }
        }
        for(int a=0;a<l;a++){
            reverse(mat[a].begin(),mat[a].end());
        }
    }
};
