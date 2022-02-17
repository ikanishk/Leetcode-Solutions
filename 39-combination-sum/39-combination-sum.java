class Solution {
    public List<List<Integer>> combinationSum(int[] a, int k) {
        int n=a.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> lt=new ArrayList<>();
        meth(ans,a,k,n,0,lt,0);
        return ans;
    }
    void meth(List<List<Integer>> ans,int a[],int k,int n,int ind,List<Integer> temp,int sum)
    {
        if(sum>k)
            return;
        if(ind==n)
        {
            if(sum==k)
            {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(a[ind]);
        meth(ans,a,k,n,ind,temp,sum+a[ind]);
        temp.remove(temp.size()-1);
        meth(ans,a,k,n,ind+1,temp,sum);
    }
}