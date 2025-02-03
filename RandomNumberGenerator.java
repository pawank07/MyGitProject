import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a number between 1 and 15: ");
        int num1 = scan.nextInt();
        int num2 = random.nextInt(10)+16;
        System.out.println("Your number is "+ num1 +" and mine is " + num2);
        
        int num3 = random.nextInt(num2-(num1+1))+num1;
        System.out.println("A random number between our number is " + num3 + "!");
    }
}