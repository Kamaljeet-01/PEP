//Single number 3 :

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            xor = nums[i]^xor;   
        }
        int mask = (xor&(xor - 1))^xor;
        int num1=0,num2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&mask) == mask){
                num1=num1^nums[i];
            }else{
                num2=num2^nums[i];
            }
        }
        arr[0]=num1;
        arr[1]=num2;
        return arr;
    }
}
