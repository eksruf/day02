package day02;

import java.util.Scanner;

public class Quiz2 {
public static void main(String[] args) {
	
	System.out.print("���� �Է��ϼ��� : ");
	Scanner input = new Scanner(System.in);
	int su1;
	su1 = input.nextInt();
	
	String s = (su1%2==0)?"¦��":"Ȧ��";
	System.out.println("�Է��� ���ڴ� "+ su1+", "+s+"�Դϴ�.");
	
	String t = (su1%3==0)?"3�� ����̴�":"3�� ����� �ƴϴ�.";
	System.out.println(su1+"="+ t);
	
	
	System.out.println("�� ���� �Է��ϼ���: ");
	
	int num1, num2 ;
	num1= input.nextInt();
	num2= input.nextInt();
	
	System.out.println("num1 : "+ num1+ ", num2 : "+ num2);
	
	String a = (num1 > num2)?"num1�� �� ũ��":"num2�� �� ũ��";
	
	System.out.println(a);
}
}
