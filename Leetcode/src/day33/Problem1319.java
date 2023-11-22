package day33;
//https://leetcode.com/problems/number-of-operations-to-make-network-connected/
public class Problem1319 {
    public int makeConnected(int n, int[][] con) {
        int[] par=new int[n];
        int[] size=new int[n];
        for(int i=0;i<n;i++){
            par[i]=i;
            size[i]=1;
        }
        int c=0;
        for(int[] ar:con){
            int v=findPar(ar[0],par);
            int u=findPar(ar[1],par);
            if(v==u){
                c++;
            }
            else{
                if(size[v]>=size[u]){
                    size[v]+=size[u];
                    par[u]=v;
                }
                else{
                    size[u]+=size[v];
                    par[v]=u;
                }
            }
        }
        int ec=0;
        for(int i=0;i<n;i++){
            if(i==par[i]){
                ec++;
            }
        }
        if(c>=ec-1)return ec-1;
        return -1;
    }
    public int findPar(int i,int[] par){
        if(i==par[i]){
            return i;
        }
        return par[i]=findPar(par[i],par);

    }
}
