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
