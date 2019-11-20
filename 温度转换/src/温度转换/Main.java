package 温度转换;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		scanner = new Scanner(System.in);
		f = scanner.nextInt();
		System.out.println((int) (5 * (f - 32) / 9.0));
	}

}
