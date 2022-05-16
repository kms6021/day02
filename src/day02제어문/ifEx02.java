package day02제어문;

import java.util.Scanner;

public class ifEx02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height;
		System.out.print("본인의 키가 110cm가 넘으면 1, 안넘으면 0 ");
		height = input.nextInt();
		
		if(height == 1) {
			System.out.print("탑승하세요");
		}
		if(height == 0) {
			System.out.println("보호자를 동반하세요");
	}





/*
현재 소지금액을 입력받고 메뉴를 골라 남은 잔돈은 구하시오.
현재 소지금액을 입력하세요 : 10000(입력)
==================
1. 짬뽕 : 5500원
2. 짜장 : 5000원
3. 탕수육 : 8000원
==================
주문하실 음식을 고르세요 : 1(입력0)
주문하신 메뉴는 짬뽕입니다.
가격은 5500원 입니다.
잔돈은 4500원 입니다.
 */

{
      Scanner sc = new Scanner(System.in);
      
      int jjam = 5500, jja = 5000, tang = 8000, total = 0;
      
      System.out.println("현재 소지금액을 입력하세요 : ");
      int mymoney = sc.nextInt();
      
      System.out.println("==================");
      System.out.println("1. 짬뽕 : 5500원");
      System.out.println("2. 짜장 : 5000원");
      System.out.println("3. 탕수육 : 8000원");
      System.out.println("==================");
      System.out.print("주문하실 음식을 고르세요 : ");
      int num = sc.nextInt();
      
      if(num == 1) {
         System.out.println("주문하신 메뉴는 짬뽕입니다.");
         System.out.println("가격은 5500원 입니다.");
         total = mymoney - jjam;
         System.out.println("잔돈은 " + total +"원 입니다.");
      }
      if(num == 2) {
         System.out.println("주문하신 메뉴는 짜장입니다.");
         System.out.println("가격은 5000원 입니다.");
         total = mymoney - jja;
         System.out.println("잔돈은 " + total +"원 입니다.");
      }
      if(num == 3) {
         System.out.println("주문하신 메뉴는 탕수육입니다.");
         System.out.println("가격은 8000원 입니다.");
         total = mymoney - tang;
         System.out.println("잔돈은 " + total +"원 입니다.");
      }
      
   }
}
}
