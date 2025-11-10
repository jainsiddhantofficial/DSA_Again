class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
    int n=nums.length,total_count=0;
    HashMap<Integer,Integer>[]dp=new HashMap[n];
    for(int i=0;i<n;i++)
    {
    dp[i]=new HashMap<>();
    }
    for(int i=1;i<n;i++)
    {
    for(int j=0;j<i;j++)
    {
    long diff=(long)nums[i]-nums[j];
    if(diff>Integer.MAX_VALUE||diff<Integer.MIN_VALUE)continue;
    int d=(int)diff;
    dp[i].put(d,dp[i].getOrDefault(d,0)+1);
    if(dp[j].containsKey(d))
    {
    dp[i].put(d,dp[i].get(d)+dp[j].get(d));
    total_count+=dp[j].get(d);
    }
    }
    }
        return total_count;

    }
}