import java.util.Scanner;   // For keyboard input
/**
 * 1. Prompt user for 2 integers
 * 2. Read inputs as "int"
 * 3. Compute their sum in "int"
 * 4. Print the result
 */

// 5.1
public class Add2Integers {  // Save as "Add2Integers.java"
    public static void BothInteger() {
        // Declare variables
        int number1, number2, sum;

        // Put up prompting messages and read inputs as "int"
        Scanner in = new Scanner(System.in);  // Scan the keyboard for input
        System.out.print("Enter first integer: ");  // No newline for prompting message
        number1 = in.nextInt();  
        System.out.print("Enter second integer: ");  // Read next input as "int"
        number2 = in.nextInt();
        in.close();  // Close Scanner

        // Compute sum
        sum = number1 + number2;

        // Display result
        System.out.println("The sum is: " + sum);   // Print with newline
    }

    // 5.2
    public static void SumProductMinMax3(){
        int number1, number2, number3;
        int sum, product;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");  // No newline for prompting message
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");  // No newline for prompting message
        number2 = in.nextInt();
        System.out.print("Enter third integer: ");  // No newline for prompting message
        number3 = in.nextInt();

        int min = number1;
        if(min > number2){
            min = number2;
        } else if(min > number3){
            min = number3;
        }

        int max = number3;
        if(max < number2){
            max = number2;
        } else if(max < number1){
            max = number1;
        }

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        System.out.println("La somme est de : " +sum);  // No newline for prompting message
        System.out.println("Le produit est de : " +product);
        System.out.println("Le min est : " +min);
        System.out.println("Le max est : " +max);

    }

    // 5.3
    public static void CircleComputation(){
        // Declare variables
        double radius, diameter, circumference, area;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double

        // Compute in "double"
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 /3 * Math.PI * radius * radius * radius; 

        // Print results using printf() with the following format specifiers:
        //   %.2f for a double with 2 decimal digits
        //   %n for a newline
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);

    }

    public static SphereComputation(){
        double radius, diameter, circumference, area;  // inputs and results - all in double
        Scanner in = new Scanner(System.in);

        // Prompt and read inputs as "double"
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();  // read input as double

        surfaceArea = 4 * Math.PI * radius * radius;
        volume = 4 /3 * Math.PI * radius * radius * radius; 

        System.out.printf("SurfaceArea is: %.2f%n", surfaceArea);
        System.out.printf("radius is: %.2f%n", radius);


    }

    public static void main (String[] args) {
        //BothInteger();
        //SumProductMinMax3();
        CircleComputation();
    }
}