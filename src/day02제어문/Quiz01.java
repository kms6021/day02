package day02제어문;

import java.util.Scanner;

public class Quiz01 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.print("수 입력 : ");
	num = input.nextInt();
		
	String s;
	s = (num%2==0)?"짝수":"홀수";
	System.out.print( num+"="+s);
	s = (num%3 == 0)?"배수":"아님";
	System.out.println(num+"="+s);
	
	int su1, su2;
	System.out.println("두 수 입력");
	su1 = input.nextInt();
	su2 = input.nextInt();
	s = (su1 > su2)?"su1크다":"su2크다";
	System.out.println(su1+","+su2+s);
}

}
