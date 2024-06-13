//Set the rightmost unset bit (gfg question):
class Solution{
    static int setBit(int n){
        // code here
        int num=0;
        for(int i=0;i<31;i++){
            int mask=(1<<i);
            num = mask | n;
            if(num != n){
                return num;
            }
        }
        return num;
    }
}

//Counting bits (Leetcode question):

class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for(int i=0;i<=n;i++){
            arr[i]=Count(i);
        }
        return arr;
    }
    public static int Count(int n){
        int mask=1;
        int count=0;
        for(int i=1;i<33;i++){
            mask=(1<<i);
            if((n & mask) != 0){
                count++;
            }
        }
        return(count);
    }
}

//Xoring and clearing (gfg question) :

class Solution {
    public void printArr(int n, int arr[]) {
        // code here
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void setToZero(int n, int arr[]) {
        // code here
        for(int i=0;i<n;i++){
            arr[i]=arr[i]&0;
        }
        
    }

    public void xor1ToN(int n, int arr[]) {
        // code here
        for(int i=0;i<n;i++){
            arr[i]=i^arr[i];
        }
        
        
    }
}
