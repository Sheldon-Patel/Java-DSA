package Lec09_Conditional;

public class Conditionals {
    static void main() {
        // if statement
        int dailyPractice = 12;

        if (dailyPractice >= 10) {
            System.out.println("Good consistency!");
        }

        int age =100;
        if(age>=18){
            System.out.println("you can vote");
        }

        // if-else statement
        int score = 42;

        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        int age1 = 20;

        if(age>18)
        {
            System.out.println("can vote");

        }
        else
        {
            System.out.println("can not vote");
        }

        // if-else-if condition
        int accuracy = 78;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        }
        else if (accuracy >= 75) {
            System.out.println("Good");
        }
        else if (accuracy >= 60) {
            System.out.println("Average");
        }
        else {
            System.out.println("Needs Improvement");
        }
    }
}

