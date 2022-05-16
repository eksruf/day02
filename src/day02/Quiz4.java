package day02;

import java.util.Scanner;

public class Quiz4 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("1.콜라");
	System.out.println("2.제티");
	System.out.println("3.커피");
	
	System.out.println("수를 입력하세요");
	int su = input.nextInt();
	
	if (su == 1)
		System.out.println("콜라를 선택하셨습니다");
	if (su == 2)
		System.out.println("제티를 선택하셨습니다");
	if (su == 3)
		System.out.println("커피를 선택하셨습니다");
}
}
