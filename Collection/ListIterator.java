package Collection;
import java.util.Random;
import java.util.Scanner;
public class ListIterator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate random lottery number (0-99)
        int lotteryNumber = random.nextInt(100);

        System.out.print("Enter your lottery number (0-99): ");
        int userNumber = sc.nextInt();

        System.out.println("Lottery number is: " + lotteryNumber);

        if (userNumber == lotteryNumber) {
            System.out.println("🎉 Congratulations! You won the lottery!");
        } else {
            System.out.println("❌ Sorry! Better luck next time.");
        }

        sc.close();
    }
}
