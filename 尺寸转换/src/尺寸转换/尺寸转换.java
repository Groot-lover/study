package 尺寸转换;

import java.util.Scanner;

public class 尺寸转换 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		int inch;
		in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
		System.out.println("foot=" + foot + ",inch=" + inch);
		System.out.println((foot + inch / 12.0) * 0.3048);
	}

}