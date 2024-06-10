//Number of factors :
// **Note**  If a number is perfect square then it will have odd number of factors otherwise even number

import java.util.*;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        for(int i=1;i<Math.sqrt(num);i++){
            if(num%i==0 ){
                if(i != num/i){
                    count+=2;
                }else if (i == num/i){
                    count++;
                }
            }
        }
        System.out.println("No. of factors are : "+count);
    }
}
