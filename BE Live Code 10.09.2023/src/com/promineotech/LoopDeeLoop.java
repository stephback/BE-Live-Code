package com.promineotech;

public class LoopDeeLoop {

	public static void main(String[] args) {

		/*
		 * Given a non-negative number "num", return true if num is within 2 of a
		 * multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5)
		 * is 2.
		 */

		// 19 && 158
		int num = 158;

		// test out nearTen method here

		// System.out.println(nearTen(num));

		/*
		 * Given 2 int values greater than 0, return whichever value is nearest to 21
		 * without going over. Return 0 if they both go over.
		 */

		int player1CardValue = 22;
		int player2CardValue = 21;

		// System.out.println(blackjack(player1CardValue, player2CardValue));

		/*
		 * Given a string, return the sum of the digits 0-9 that appear in the string,
		 * ignoring all other characters. Return 0 if there are no digits in the string.
		 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1',
		 * .. '9'. Integer.parseInt(string) converts a string to an int.)
		 * sumDigits("aa1bc2d3") → 6 sumDigits("aa11b33") → 8 sumDigits("Chocolate") → 0
		 */

		String word = "123456789Bird";
		System.out.println(sumOfDigits(word));

	}

	public static Integer sumOfDigits(String word) {
		int sum = 0;
		for (int index = 0; index < word.length(); index++) {
			Character letter = word.charAt(index);
			if (Character.isDigit(letter)) {
				// Integer.parseInt(word.charAt(index));
				// sum += word.charAt(index);

				sum += Character.getNumericValue(letter);

				System.out.println(sum);
			}

		}

		return sum;

	}

	public static boolean nearTen(int num) {
		if (num % 10 <= 2 || num % 10 == 8 || num % 10 == 9) {
			return true;
		} else {
			return false;
		}

	}

	public static int blackjack(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;

		} else if (b > 21 && a <= 21) {
			while (a <= 21) {
				return a;
			}

		} else if (a > 21 && b <= 21) {
			while (b <= 21) {
				return b;
			}
		} else if ((21 - a) < (21 - b)) {
			return a;
		} else if ((21 - a) > (21 - b)) {
			return b;
		}
		return 0;
	}

}
