class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=-1;
            for(int step=1;step<nums.length;step++)
            {
                int idx=(i+step)%nums.length;
                if(nums[idx]>nums[i]) 
                {
                    ans[i]=nums[idx];
                    break;
                }
            }
        }
        return ans;
    }
}