class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        return Math.max(f(nums,firstLen,secondLen),f(nums,secondLen,firstLen));
    }
    int f(int []nums,int l,int r){
        int n = nums.length;
        int sumL  =0,sumR=0;
        for(int i=0;i<l;i++)sumL+=nums[i];
        for(int j=l;j<l+r;j++) sumR+=nums[j];
        int maxL = sumL,result = sumL+sumR;
        for(int i=l+r;i<n;i++){
            sumL+=nums[i-r]-nums[i-r-l];
            sumR+=nums[i]-nums[i-r];
            maxL = Math.max(maxL,sumL);
            result = Math.max(result,maxL+sumR);
        }
        return result;
    }
}