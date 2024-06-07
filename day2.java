//1283. Find the Smallest Divisor Given a Threshold    Time : 12ms  Complexity : nlog(high) : sorting : (nLogN) and Binary search : O(LogN) 
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low=1, high = nums[nums.length - 1];
        int store=0;
        while(low<=high){
            int mid = (high+low)/2;
            int result = Sum(nums,mid);
            if(result<=threshold){
                high = mid - 1;
                store = mid;
            }else{
                low = mid + 1;
            }
        }
        return store;
    }
    public int Sum(int[] nums,int div){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i] + div - 1) / div;
        }
        return sum;
    }
}


// Aggressive Cow <Binary Search in Answer Array concept >  Time Complexity : O(nLogN)


class Solution {
     
    public static boolean IsPossible(int[] stalls,int mid,int k){
        int cow =1;
        int idx=0;
        for(int i=1;i<stalls.length;i++){
            if((stalls[i] - stalls[idx])>=mid){
                cow++;
                idx=i;
            }
        }
        if(cow >= k){
            return true;
        }else{
            return false;
        }
    }
    public static int BinarySearch(int k,int[] stalls){
        int low = 1, high = stalls[stalls.length - 1]- stalls[0];
        int store =100;
        while(low<=high){
            int mid = (low+high)/2;
            boolean check = IsPossible(stalls,mid,k); 
            if(check == true){
                low=mid + 1;
                 store = mid;
            }else{
                high = mid - 1;
            }
      }
      return store;
    }
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
       return ( BinarySearch(k,stalls));
    }
}



//Search in 2D Matrix:    Time Complexity : O(log(n*m))

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return (Binary(matrix,target));
        
    }
    public boolean Binary(int[][] matrix,int target){
        int low=0,high=(matrix[0].length * matrix.length - 1);
        int row=0,col=0;
        while(low<=high){
            int mid = (low+high)/2;
            row=mid/matrix[0].length;
            col=mid % matrix[0].length;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                high=mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}

