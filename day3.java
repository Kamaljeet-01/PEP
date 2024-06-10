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

//Prime number or not : 
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
        if(count==2){
            System.out.println("Prime");}
        else System.out.println("Not prime");
    }
}


//Count Factors using seivefo..


class Solution {
    public int countPrimes(int n) {
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int count=0;
        // Print all prime numbers
        for (int i = 2; i <n; i++) {
            if (prime[i] == true)
                count++;
    }
    return (count);
}
}
