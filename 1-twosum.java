class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int requiredvalue = 0;
        for (int i=0; i< nums.length; i++) {
            if(!map.containsKey(nums[i])){
               map.put(nums[i], i);
            }
            requiredvalue = target - nums[i]; 
            if (map.containsKey(requiredvalue) && i != map.get(requiredvalue)) {
                return new int[] {i, map.get(requiredvalue)};
            } 
        }
        return new int[] {1,1};
    }
}
