class Solution 
{
    public void duplicateZeros(int[] arr) 
    {
        Stack <Integer> stack = new Stack <>();
        for(int num : arr)
        {
            if(num == 0)
            {
                stack.push(0);
                stack.push(0);
            }
            else
            {
                stack.push(num);
            }
        }

        while(stack.size()!=arr.length)
        {
            stack.pop();
        }

        for(int i = arr.length-1; i >= 0;i--)
        {
            arr[i] = stack.pop();
        }


    }
}