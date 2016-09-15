
package challenges;

import java.util.Scanner;

public class Challenges {


    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        
        System.out.println("Name a country");
        String country = sc.nextLine();
        System.out.println("What is it's population?");
        String population = sc.nextLine();
        System.out.println(country + " has a population of " + population);
        
        Scanner kb = new Scanner(System.in);
                int num1;
                int num2;
                System.out.println("Pick a number");
                num1 = kb.nextInt();
                System.out.println("Pick a second number");
                num2 = kb.nextInt();
                System.out.println(num1 + " divided by " + num2 + " equals " + (num1 / num2));
                
                
        int num3;
        System.out.println("Chose a number");
        num3 = kb.nextInt();
        if (num3 < 100){
            System.out.println("Your number is less than 100");
        }if (num3 > 100){
            System.out.println("Your number is more than 100");
        }else{
            System.out.println("Your number is 100");
        }
        
        int score;
        System.out.println("What was your score?");
        score = kb.nextInt();
        if (score > 19){
            System.out.println("Well done, you achieved an A");  
        }else if (score > 9){
            System.out.println("You achieved a C");
        }else{
            System.out.println("You have failed");
        }
        
        int width;
        int length;
        System.out.println("What is the length?");
        length = kb.nextInt();
        System.out.println("What is the width?");
        width = kb.nextInt();
        System.out.println("The area of the rectangle is " + (length*width));
        
        int speed;
        int time;
        System.out.println("What was the speed?");
        speed = kb.nextInt();
        System.out.println("How long did it take?");
        time = kb.nextInt();
        System.out.println("The distance travelled was " + (speed*time));
        
        int num4;
        int num5;
        System.out.println("Pick a number");
        num4 = kb.nextInt();
        System.out.println("Pick a second number");
        num5 = kb.nextInt();
        System.out.println("Pick an operation for the two numbers");
        String answer = sc.nextLine();
        if (answer=="+") {
            System.out.println("Your answer is" + (num4 + num5));
        }if (answer=="-") {
            System.out.println("Your answer is " + (num4 - num5));
        }if (answer=="*") {
            System.out.println("Your answer is " + (num4 * num5));
        }if (answer=="/") {
            System.out.println("Your answer is " + (num4 / num5));
        }else{
            System.out.println("please enter a correct character");
        }
 {
            
        }
        

    }
    
}
