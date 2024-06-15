//Finding missing number using bitwise operator :


class HelloWorld{
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int n =5;
        int sum=0;
        for(int i=1;i<=5;i++){
            sum = sum^i;
        }
        for(int i=0;i<arr.length;i++){
            sum=sum^arr[i];
        }
        System.out.println("sum : "+sum);
    }
}

//Check whether Kth bit is set or not 

class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int num = 1 << k;
        int ans = num & n;
        if(ans == 0){
            return false;
        }
        return true;
    }
}


//Single number II (137):

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int temp=0;
        int result =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                count=0;
            }
            if(count == 2){
                temp=nums[i];
                result = result^temp; 
                count++;
            }
            result=result^nums[i];
            count++;
        }
        return result;
    }
}

//Correct way to do above code :

class HelloWorld {
    public static int Search(int[] arr){
        int ans =0;
        for(int i=0;i<=31;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if((arr[j]&(1<<i)) != 0){
                    sum++;
                }
            }
            if(sum%3 == 1){
                ans = ans | (1<<i);
            }
            
        }
        return (ans);
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,8,7,7,7,9,9,9,19,19,19};
        System.out.println("num : "+Search(arr));
    }
}
