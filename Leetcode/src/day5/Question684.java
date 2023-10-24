package day5;
//https://leetcode.com/problems/redundant-connection/
public class Question684 {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length+1;
        int[] par=new int[n];
        int[] size=new int[n];
        for(int i=0;i<n;i++){
            par[i]=i;
            size[i]=1;
        }
        int[] ans=new int[2];
        for(int[] ar:edges){
            int pu=findPar(ar[0],par);
            int pv=findPar(ar[1],par);
            if(pu!=pv){
                if(size[pu]>size[pv]){
                    size[pu]+=size[pv];
                    par[pv]=pu;
                }
                else{
                    size[pv]+=size[pu];
                    par[pu]=pv;
                }
            }
            else{
                ans=ar;
            }
        }
        return ans;

    }
    public int findPar(int i,int[] par){
        if(par[i]==i)return i;
        return par[i]=findPar(par[i],par);
    }
}
