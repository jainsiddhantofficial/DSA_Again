class Solution {
    public long maxProduct(int[] nums) {
        int max = 0;
        for(int num: nums) {
            max = Math.max(max, num);
        }
        int maxMask = Integer.highestOneBit(max) * 2 - 1;
        int[] zeroMask = new int[maxMask+1];

        for(int num: nums) {
            int zeroBits = ((~num) & maxMask);
            zeroMask[zeroBits] = num;
        }
        for(int bits = maxMask; bits > 0; --bits) {
            for(int digit = 1; digit < maxMask; digit = (digit << 1)) {
                zeroMask[bits] = Math.max(zeroMask[bits], zeroMask[(bits | digit)]);
            }
        }
        long res = 0;
        for(int num: nums) {
            long cur = num;
            res = Math.max(res, cur * zeroMask[num]);
        }
        return res;
    }
}