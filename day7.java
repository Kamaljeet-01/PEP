//Impplementation of Stack using array.

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int n=0;
        int ptr=-1;
        System.out.println("choose option :\n1.Add element\n2.remove Element\n3.display element\n4.Topmost element\n5.Exit");
        while(n!=5){
            System.out.println("Enter number :");
            n=sc.nextInt();
            switch(n){
                case 1:
                    if(ptr<=4){
                   arr[ptr + 1]=sc.nextInt();
                   ptr++;}
                   else System.out.println("Stack is full.");
                   break;
                case 2:
                    if(ptr>=0){
                    arr[ptr]=0;
                    ptr--;}
                    else System.out.println("Stack is empty.");
                    break;
                case 3:
                    if(ptr == -1) System.out.println("Stack is empty.");
                    else if(ptr > 4) System.out.println("Stack is full.");
                    else {
                    for(int i=ptr;i>=0;i--){
                        System.out.print(arr[i]+" ");
                    }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println(arr[ptr]);
                    break;
                case 5 : 
                    System.out.println("Exiting the code.");
                    break;
                default:
                    System.out.println("Enter valid number.");
                    break;
                    
            }
        }
    }
}
