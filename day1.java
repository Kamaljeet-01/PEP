// POTD
//#search in rotated sorted array
//#row with maximum number of 1's
//#find position of element in infintely sorted array


//1.  <Leetcode Accepted code >
class Solution {
    public int search(int[] nums, int target) {
        int start = Starting(nums);
        if(start != 0){
        int result1 = Binary(nums,0,start - 1,target);
        int result2 = Binary(nums,start,nums.length - 1,target);
        if(result1 != -1) return result1;
        else return result2;
        }else{
            return (Binary(nums,0,nums.length - 1,target));
        }
    }
  //function to find from where we can split the rotated array in 2 sorted arrays.
    public int Starting(int[] nums){
            int low=0,high=nums.length - 1;
            if(nums.length == 1) return 0;
            while(low<=high){
                int mid = (low+high)/2;
                if(mid > 0 && nums[mid] < nums[mid - 1]){
                    return (mid);
                }else if(nums[mid]>nums[high]){
                    low=mid + 1;
                }else{
                    high=mid - 1;
                }
            }
            return 0;
    }
  //Binary search function which returns the index of target
    public int Binary(int[] nums,int low,int high,int target){
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                high = mid - 1;
            }else if(nums[mid]<target){
                low= mid + 1;
            }
        }
        return -1;

    }
}
