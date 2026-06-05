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

        int day=3;
        if(day==1){
            System.out.println("monday");
        }
        else if (day == 2) {
            System.out.println("tuesday");
        }
        else if (day == 3) {
            System.out.println("wednesday");
        }
        else if (day == 4) {
            System.out.println("thursday");
        }
        else if (day == 5) {
            System.out.println("friday ");
        }
        else if (day == 6) {
            System.out.println("saturday");
        }
        else {
            System.out.println("sunday");
        }
        System.out.println("abb ma line 76 par aaya hu");

        //nested if else statement
        boolean hasSubscription = true;
        int solvedProblems = 220;
              // hassubscription is true
        if (hasSubscription) {

            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practice More Problems");
            }

        } else {
            System.out.println("Upgrade to Premium");
        }


        int age2 = 12;
        int gender ='M';
        // true aaya means execute if and ignore else
        if(gender == 'M' ){
            System.out.println("you are male");
            // false mean ignore if and execute else
            if(age > 18){
                System.out.println("you are male and age>18");
            }
            else{
                System.out.println("you are male and age<18");
            }
        }
        else {
            System.out.println("you are not male");
            if(age > 18){
                System.out.println("you are not male and age>18");
            }
            else{
                System.out.println("you are not male and age<18");
            }
        }

        // ternary operator
        int streakDays = 35;

        String status = (streakDays >= 30) ? "Consistent" : "Irregular";

        System.out.println(status);
    }
}

