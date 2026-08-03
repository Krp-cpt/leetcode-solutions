class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=0,m=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=nums.length-1;j>0;j--)
            {
                if(i!=j && target == nums[i] + nums[j])
                {
                    n=i;
                    m=j;
                    break;
                }
            }
        }
        return new int[]{n,m};
    }
}