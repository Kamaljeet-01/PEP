//Problem no : 153
//Find Minimum in rotated Sorted Array:  Time Complexity : (LogN)

class Solution {
    public int findMin(int[] nums) {
         int low=0,high=nums.length - 1;
            if(nums.length == 1) return nums[0];
            while(low<=high){
                int mid = (low+high)/2;
                if(mid > 0 && nums[mid] < nums[mid - 1]){
                    return (nums[mid]);
                }else if(nums[mid]>nums[high]){
                    low=mid + 1;
                }else{
                    high=mid - 1;
                }
            }
            return nums[0];
    }
}
