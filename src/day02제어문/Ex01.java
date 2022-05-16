package day02제어문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		final String KOREA = "대한민국"; // final 해당값은 절대로 변경x & 해당값은 대문자로!
		System.out.println( KOREA );
		//KOREA = "캐나다";
		//System.out.println( KOREA );
		
		Scanner input = new Scanner(System.in); // string처럼 쓰이는, 뒤에 변수 쓰는건 정해진 규칙이 있음	
		System.out.print("이름 입력 : ");
		String name = input.next();
		int age;
		System.out.println("나이 입력 : ");
		age = input.nextInt(); //nextchar, double 등 다른 변수도 가능
		
		System.out.println(name+"님의 나이는 "+age);
	}
} */
		Scanner input = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까 ? ");
		String name = input.next();
		int age;
		int korean;
		int english;
		int math;
		
		System.out.print(name+ "님의 국어 점수 : ");
		korean = input.nextInt();
		System.out.print(name+ "님의 영어 점수 : ");
		english = input.nextInt();
		System.out.print(name+ "님의 수학 점수 : ");
		math = input.nextInt();
		
		System.out.println("============================");
		System.out.println("이 름 : "+name);
		System.out.println("============================");
		System.out.println("국 어 : "+korean);
		System.out.println("영 어 : "+english);
		System.out.println("수 학 : "+math);
		System.out.println("============================");
		
		System.out.println("합 계 : "+(korean+english+math) );
		System.out.println("============================");
	}	
} 
