package day02���;

import java.util.Scanner;

public class ifEx01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		System.out.print("������ �Է��ϼ��� > ");
		score = input.nextInt();
		
		if(score >= 70) {
			System.out.println("�հ�");
		}
		
		if(score < 70) {
			System.out.println("���հ�");
		}
	}

}
