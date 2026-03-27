class Solution {
    public int getMinSwaps(String num, int k) {
        int [] nums = new int[num.length()];

        for(int i=0; i<num.length(); i++){
            nums[i] = num.charAt(i) - '0';
        }

        int [] kthSmallestPerm = findKthPermutation(nums.clone(), k);

        int minSwaps = findMinSwaps(nums, kthSmallestPerm);
        return minSwaps;

    }

    private int[] findKthPermutation(int [] arr, int k){
        while(k-->0){
            computeNextPerm(arr);
        }
        return arr;
    }
    private void computeNextPerm(int [] arr){
        int i = arr.length-2;

       // find the first element value which is smaller than next element breaks the non decreasing order from right
        while(i>=0 && arr[i] >= arr[i+1]) i--;

         //find index which is just greater than that index value
        if(i>=0){
            int j = arr.length-1;
            while(j>=0 && arr[i] >= arr[j]) j--;
            swaps(arr, i,j);
        }
        // we know that the right section is in decreasing order so we can revers it to get smallest permutation
        reverse(arr, i+1);
    }
    private void swaps(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(int [] arr, int i){
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private int findMinSwaps(int [] nums, int [] kthPermutation ){
        int i=0;
        int n = nums.length;

        int cntMinSwaps =0;

        while(i<n){

            // find the correct position of matched value
            int j = i;
            while(j< n && nums[i]  != kthPermutation[j]) j++;

            
            while(j>i){
                swaps(kthPermutation,j-1, j );
                cntMinSwaps++;
                j--;
            }
            i++;
        }
        return cntMinSwaps;

    }

}