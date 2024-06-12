//Bubble sort 

class HelloWorld {
    public static void main(String[] args) {
       int[] arr = {5,7,2,9,8,1};
       int temp=0;
       boolean flag=false;
       for(int i=0;i<arr.length - 1;i++){
           for(int j=1;j<arr.length - i;j++){
               if(arr[j]<arr[j - 1]){
                  temp = arr[j];
                  arr[j]=arr[j - 1];
                  arr[j - 1]= temp;
                  flag=true;
               }
           }
           if(flag == false) break;
       }
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+ " ");
       }
    }
}

//GFG Selection sort Question :  (DIFFERENT APPROACH)

class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int maxIdx=0;
        int maxEle=arr[0];
        for(int j=1;j<=i;j++){
        if(arr[j]>maxEle){
            maxEle = arr[j];
            maxIdx = j;
        }}
        return maxIdx;
	}
	
	void selectionSort(int arr[], int n)
	{
	    int temp=0;
	    for(int i=1;i<=n;i++){
	        int max=select(arr,n - i);
	        int swapingIdx = n - i;
	        temp=arr[n - i];
	        arr[n - i] = arr[max];
	        arr[max]= temp;
	    }
	}
}


//Selection sort (Simple Approach)

class HelloWorld {
    public static void main(String[] args) {
       int[] arr = {5,7,2,9,8,1};
       int temp=0;
       boolean flag=false;
       for(int i=0;i<arr.length - 1;i++){
           for(int j=i + 1;j<arr.length;j++){
               if(arr[j]<arr[i]){
                  temp = arr[j];
                  arr[j]=arr[i];
                  arr[i]= temp;
                  flag=true;
               }
           }
           if(flag == false) break;
        
       }
        for(int k=0;k<arr.length;k++){
           System.out.print(arr[k]+ " ");
       }
    }
}


//Factorial using recursion : (Simple code )


class HelloWorld {
    public static int Count(int n){
    if (n==0 || n==1) return 1;
     return n*Count(n - 1);
    }
    public static void main(String[] args) {
       int n =5;
       System.out.println(Count(n));
    }
}


//Merge 2 sorted Arrays :

class HelloWorld {
    public static void main(String[] args) {
       int[] arr={1,3,5,6,7};
       int[] nums={2,8,9,10,11};
       int[] res = new int[10];
       int i=0,j=0;
       for(int k=0;k<10;k++){
           
           if(i<5 && j<5){
                if(arr[i]<nums[j]){
                    res[k]=arr[i];
                    i++;
                }else{
                    res[k]=nums[j];
                    j++;
                }
           }
           //if 1 array is finished
           else{
               if(i>=5){
                   res[k]=nums[j];
                   j++;
               }else{
                   res[k]=arr[i];
                   i++;
               }
           }
       }
       for(int m=0;m<10;m++){
           System.out.print(res[m]+" ");
       }
        }
}
