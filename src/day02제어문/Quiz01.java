package day02���;

import java.util.Scanner;

public class Quiz01 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.print("�� �Է� : ");
	num = input.nextInt();
		
	String s;
	s = (num%2==0)?"¦��":"Ȧ��";
	System.out.print( num+"="+s);
	s = (num%3 == 0)?"���":"�ƴ�";
	System.out.println(num+"="+s);
	
	int su1, su2;
	System.out.println("�� �� �Է�");
	su1 = input.nextInt();
	su2 = input.nextInt();
	s = (su1 > su2)?"su1ũ��":"su2ũ��";
	System.out.println(su1+","+su2+s);
}

}
