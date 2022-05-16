package day02제어문;

import java.util.Scanner;

public class ifEx01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		System.out.print("점수를 입력하세요 > ");
		score = input.nextInt();
		
		if(score >= 70) {
			System.out.println("합격");
		}
		
		if(score < 70) {
			System.out.println("불합격");
		}
	}

}
