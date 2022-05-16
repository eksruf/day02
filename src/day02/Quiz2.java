package day02;

import java.util.Scanner;

public class Quiz2 {
public static void main(String[] args) {
	
	System.out.print("수를 입력하세요 : ");
	Scanner input = new Scanner(System.in);
	int su1;
	su1 = input.nextInt();
	
	String s = (su1%2==0)?"짝수":"홀수";
	System.out.println("입력한 숫자는 "+ su1+", "+s+"입니다.");
	
	String t = (su1%3==0)?"3의 배수이다":"3의 배수가 아니다.";
	System.out.println(su1+"="+ t);
	
	
	System.out.println("두 수를 입력하세요: ");
	
	int num1, num2 ;
	num1= input.nextInt();
	num2= input.nextInt();
	
	System.out.println("num1 : "+ num1+ ", num2 : "+ num2);
	
	String a = (num1 > num2)?"num1이 더 크다":"num2가 더 크다";
	
	System.out.println(a);
}
}
