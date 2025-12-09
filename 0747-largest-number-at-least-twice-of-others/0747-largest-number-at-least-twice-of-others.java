class Solution {
    public int dominantIndex(int[] nums) {

        // Initialize largest element (l) with the first element
        int l = nums[0];

        // Initialize second largest (sl) as -1 (since values are non-negative per constraints)
        int sl = -1;

        // Track index of the largest element
        int lindex = 0;

        // Traverse the array in a single pass
        for(int i = 0; i < nums.length; i++){

            // If current element becomes the new largest
            if(nums[i] > l){
                sl = l;        // old largest becomes second largest
                l = nums[i];   // update largest
                lindex = i;    // update index of largest
            }
            // Otherwise update second largest if applicable
            else if(nums[i] < l && nums[i] > sl) {
                sl = nums[i];
            }
        }

        // Check if largest element is at least twice the second largest
        return (l >= 2 * sl) ? lindex : -1;
    }
}