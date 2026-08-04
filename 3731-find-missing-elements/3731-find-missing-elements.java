class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list  = new ArrayList<>();
        Arrays.sort(nums);
        int i=nums[0];
        while(i<=nums[nums.length-1]){
            list.add(i);
            i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(list.contains(nums[j]))
            {
                list.remove(Integer.valueOf(nums[j]));
            }
        }
    return list;
       
    }
}