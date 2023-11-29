package day40;
//https://leetcode.com/problems/count-servers-that-communicate/
public class Problem1267 {
    public int countServers(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] rows=new int[m];
        int[] cols=new int[n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    rows[i]++;
                    cols[j]++;
                    ans++;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && rows[i]==1 && cols[j]==1){
                    ans--;
                }
            }
        }
        return ans;
    }
}
