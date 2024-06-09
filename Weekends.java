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



/// FLOOR function:

 public static void Floor(int[] arr,int target){
        int low=0;
      int high=4;
     int  floor=-1;
      while(low<=high){
           int mid = (low+high)/2;
          if(arr[mid]==target){
              floor=arr[mid];
              break;
          }
          else if(arr[mid]>target){
              high=mid - 1;
          }else if(arr[mid]<target){
              floor=arr[mid];
              low=mid + 1;
          }
      }
          System.out.println("Floor : "+floor);
    }



//CEIL function :

    public static void Ceil(int[] arr,int target){
        int low=0;
        int high=4;
        int  ceil=-1;
      while(low<=high){
           int mid = (low+high)/2;
          if(arr[mid]==target){
              ceil=arr[mid];
              break;
          }
          else if(arr[mid]>target){
              ceil=arr[mid];
              high=mid - 1;
          }else if(arr[mid]<target){
              
              low=mid + 1;
          }
      }
          System.out.println("Ceil : "+ceil);
    }

