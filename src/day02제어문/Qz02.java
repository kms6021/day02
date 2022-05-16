package day02제어문;

import java.util.Scanner;

public class Qz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하시오 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("1.+, 2.-, 3.*, 4./");
		System.out.println("연산자를 입력하세요");
		int z = sc.nextInt();
		
		
		if(z == 1) {
			System.out.println(a + b);
		}
		if(z == 2) {
			System.out.println(a - b);
		}
		if(z == 3) {
			System.out.println(a * b);
		}
		if(z == 4) {
			System.out.println(a / b);
		}
	}

}
