package level0;

public class SumOfTwoNumbers {
	public static void main(String[] args) {

		System.out.printf("%d", solution(50000, 3));

	}

	static int solution(int num1, int num2) {
		int answer = -1;
		int minimum = -50000;
		int maximum = 50000;

		boolean val = (minimum <= num1 && num1 <= maximum && minimum <= num2 && num2 <= maximum);

		if (val) {
			answer = num1 + num2;
		}
		return answer;

	}
}
