package day02제어문;

public class Ex04 {

	public static void main(String[] args) {
		int num = 1;
		if(num%2 == 0) {
			System.out.println("짝수");
		}
		if(num%2 != 0) {
			System.out.println("홀수");			
		}
		
		
		
		if(num > 10)
		{ //if문 안에 중괄호는 if문의 종속조건으로 들어감
			System.out.println("1.num 10보다 작다"); //if문에 대한 종속조건 만약에 참이 아니면 다음 문장으로 넘어감 참이면 조건문 실행 후 다음 문장으로 넘어감
			System.out.println("2.num 10보다 작다");
			System.out.println("3.num 10보다 작다");
		}
			System.out.println("다음 문장들 실행");
		
	}

}
