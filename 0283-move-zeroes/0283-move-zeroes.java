class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = nums.length;
       while(i<j)
       {
        if(nums[i] == 0)
        {
            int k = i;
            while(k<j-1)
            {
                int temp = nums[k+1];
                nums[k+1] = nums[k];
                nums[k] = temp;
                k++;
            }
            j--;
        }
        if(nums[i] != 0){
            i++;
        }
       }
    }
}