package test.overload;

import java.util.Scanner;

public class RunMehodOverload {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		MethodOverloadTest ot = new MethodOverloadTest();
		
		System.out.println("===== 두 수의 덧셈 =====");
		System.out.print("* 정수1 입력:");
		int n1 = s1.nextInt();
		System.out.print("* 정수2 입력:");
		int n2 = s1.nextInt();
		System.out.printf("%d + %d = %d\n", n1, n2, ot.calc(n1, n2));
		
		
		System.out.println("===== 두 수의 곱셈 =====");
		System.out.print("* 실수1 입력:");
		double n3 = s1.nextDouble();
		System.out.print("* 실수2 입력:");
		double n4 = s1.nextDouble();
		System.out.printf("%.1f * %.1f = %.3f\n", n3, n4, ot.calc(n3, n4));

		s1.close();
	}

}
