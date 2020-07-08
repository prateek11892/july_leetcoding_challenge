// 3Sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0 ; i <nums.length;i++){
            if(i!=0 && nums[i] == nums[i-1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;
            while(j<k){
                if(nums[i] + nums[j] + nums[k] == 0)   {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[j]);
                    list1.add(nums[k]);
                    arrList.add(list1);
                    ++j;
                    while(j<k && nums[j] == nums[j-1])
                        ++j;
                }
                else if(nums[i] + nums[j] + nums[k] < 0)
                    ++j;
                else
                    --k;
            }
        }
        return arrList;
    }
}
