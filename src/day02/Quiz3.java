package day02;

import java.util.Scanner;

public class Quiz3 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	

	
	System.out.println("����� ���������� �����ּ���: ");
	
	double kor, eng;
	
	kor = input.nextInt();
	eng = input.nextInt();
	

	if(((kor+eng)/2)>80)
	{
		System.out.println("�հ�");
	}
	if (((kor+eng)/2)<=80)
	{
		System.out.println("���հ�");
	}
}
}



