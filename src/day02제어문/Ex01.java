package day02���;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		final String KOREA = "���ѹα�"; // final �ش簪�� ����� ����x & �ش簪�� �빮�ڷ�!
		System.out.println( KOREA );
		//KOREA = "ĳ����";
		//System.out.println( KOREA );
		
		Scanner input = new Scanner(System.in); // stringó�� ���̴�, �ڿ� ���� ���°� ������ ��Ģ�� ����	
		System.out.print("�̸� �Է� : ");
		String name = input.next();
		int age;
		System.out.println("���� �Է� : ");
		age = input.nextInt(); //nextchar, double �� �ٸ� ������ ����
		
		System.out.println(name+"���� ���̴� "+age);
	}
} */
		Scanner input = new Scanner(System.in);
		System.out.print("����� �̸��� �����Դϱ� ? ");
		String name = input.next();
		int age;
		int korean;
		int english;
		int math;
		
		System.out.print(name+ "���� ���� ���� : ");
		korean = input.nextInt();
		System.out.print(name+ "���� ���� ���� : ");
		english = input.nextInt();
		System.out.print(name+ "���� ���� ���� : ");
		math = input.nextInt();
		
		System.out.println("============================");
		System.out.println("�� �� : "+name);
		System.out.println("============================");
		System.out.println("�� �� : "+korean);
		System.out.println("�� �� : "+english);
		System.out.println("�� �� : "+math);
		System.out.println("============================");
		
		System.out.println("�� �� : "+(korean+english+math) );
		System.out.println("============================");
	}	
} 
