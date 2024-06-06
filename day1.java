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



//2. < Rows with maximum 1s>  time : 5ms
    
class Solution {
    public int Count(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = new int[2];
        int[] arr = new int[mat.length];
        int max=0,index=0;
        for(int i=0;i<mat.length;i++){
            arr[i]=Count(mat[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max= arr[i];
                index = i;
            }
        }
        ans[0]=index;
        ans[1]=max;
        return ans;

    }
}


//Another approach Time :4ms

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[mat.length];
        int max=0,index=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) 
                    count++;
            }
            if(count==mat[i].length){
                index=i;
                max=count;
                break;
            }else{
            arr[i]=count;
            if(arr[i]>max){
                max = arr[i];
                index=i;
            }
            }
        }
        return new int[] {index,max}; 
    }
}
