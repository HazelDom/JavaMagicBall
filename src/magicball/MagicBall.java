package magicball;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {

	public static void main(String[] args) {

		System.out.println("Enter your question");
		Scanner scan = new Scanner(System.in);
		scan.next();
		scan.close();

		Random rng = new Random();
		int r = rng.nextInt(14);
		System.out.println(r);

		if (r == 0) {

			System.out.println("As I see it, yes");
		} else if (r == 1) {
			System.out.println("Most likely");
		} else if (r == 2) {
			System.out.println("Outlook good");
		} else if (r == 3) {
			System.out.println("Signs point to yes");
		} else if (r == 4) {
			System.out.println("Yes");
		} else if (r == 5) {
			System.out.println("Don't count on it");
		} else if (r == 6) {
			System.out.println("My reply is no");
		} else if (r == 7) {
			System.out.println("My sources say no");
		} else if (r == 8) {
			System.out.println("Outlook not so good");
		} else if (r == 9) {
			System.out.println("Very doubtful");
		} else if (r == 10) {
			System.out.println("Ask again later");
		} else if (r == 11) {
			System.out.println("Better not tell you now");
		} else if (r == 12) {
			System.out.println("Cannot predict now");
		} else if (r == 13) {
			System.out.println("Concentrate and ask again");
		} else if (r == 14) {
			System.out.println("Without a doubt");
		}

	}

}
