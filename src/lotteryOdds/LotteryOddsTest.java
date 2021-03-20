package lotteryOdds;

import java.util.Scanner;

public class LotteryOddsTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt(); // 6

        System.out.println("What is the highest number you can drew?");
        int n = in.nextInt(); // 50

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            // means (n - k + 1) / k
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("You odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
