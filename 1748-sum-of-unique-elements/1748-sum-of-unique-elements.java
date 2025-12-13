class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int i:arr.keySet()){
            if(arr.get(i)==1){
                sum+=i;
            }
        }
        return sum;
    }
}