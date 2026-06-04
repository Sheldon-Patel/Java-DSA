package Lec07_Operators;

public class operators {

    public static void main() {
// arithmetic operator
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

// relational operator
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);

        // logical operation
        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);

        // assignment operator
        int ratingPoints = 100;

        ratingPoints += 20;  // ratingPoints = ratingPoints + 20   100+20
        System.out.println(ratingPoints);

        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10         120-10
        System.out.println(ratingPoints);

        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2          110*2
        System.out.println(ratingPoints);

        ratingPoints /= 4;   // ratingPoints = ratingPoints / 4        220/4
        System.out.println(ratingPoints);

        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30         55%30
        System.out.println(ratingPoints);

// unary inc/dec operator
        int activeUsers = 100;

        // first inc 101 the use
        int prefix = ++activeUsers;
        // phela use 101 then inc 102
        int postfix = activeUsers++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);
    }
}

