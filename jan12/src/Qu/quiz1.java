package Qu;

import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("소수점 2번째 자리 입력해보소.");
		double a = sc.nextDouble();
			
		System.out.println(Math.round(a*10)/10.0);
		sc.close();
	
	}

}
