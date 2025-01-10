// Date : 10-01-2025
//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class Example1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create obj of scanner class
        System.out.println("Enter a number"); 
        int num = sc.nextInt();  // take input as a number and store in num variable

        // check if a even or odd number
        if(num % 2 ==0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
}