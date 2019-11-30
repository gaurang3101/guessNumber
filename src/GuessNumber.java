import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    int n;

    public void guessTheNumber() {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        if (n==number) System.out.println("Yes, you are right, I was thinking of " + number + "!");
        else System.out.println("No, the number I was thinking of was " + number + "\nYou were off by " + (number-n));
    }

    GuessNumber(int n) {
        this.n=n;
    }

}

class GuessMatcher {
    public static void main(String[] args) {
        System.out.println("I am thinking of a number between 1 and 100 (including both):");
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Can you guess what it is? ");
        num = sc.nextInt();
        GuessNumber gn = new GuessNumber(num);
        gn.guessTheNumber();
    }
}