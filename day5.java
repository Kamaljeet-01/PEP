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
