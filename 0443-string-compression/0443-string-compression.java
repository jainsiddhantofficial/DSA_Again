class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int read = 0;
        int write = 0;
        while(read<n){
            char current = chars[read];
            int count = 0;
            while(read<n && current == chars[read]){
                read++;
                count++;
            }
            chars[write++] = current;

            if(count>1){
                String countStr = String.valueOf(count);
                for(char c: countStr.toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;
    }
}