package day02���;

import java.util.Scanner;

public class Qz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� ������ �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("1.+, 2.-, 3.*, 4./");
		System.out.println("�����ڸ� �Է��ϼ���");
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
