package day02;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	final String KOREA = "���ѹα�";
	System.out.println(KOREA);
//	KOREA = "�ɳ���";
//	System.out.println(KOREA);
	
//	Scanner iScanner(System.in);
//	System.out.print("�̸��Է�: ");
//	String name = ����.next();
//	int age;
//	System.out.println("�����Է�: ");
//	age = ����.nextInt();
//
//	
//	System.out.println(name + "���� ���̴� " + age);
//	
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("����� �̸��� �����Դϱ�?");
	String name = input.next();
	
	System.out.println(name+"���� ���� ����:");
	int korea;
	korea = input.nextInt();
	System.out.println(name+"���� ���� ����: ");
	int eng;
	eng = input.nextInt();
	System.out.println(name+"���� ���� ����: ");
	int math;
	math = input.nextInt();
	
	int total;
	total = korea+eng+math;
	
	System.out.println("====================");
	System.out.println("�̸� : "+name);
	System.out.println("====================");
	System.out.println("���� : "+korea);
	System.out.println("���� : "+eng);
	System.out.println("���� : "+math);
	System.out.println("====================");
	System.out.println("�հ� : "+total);
	System.out.println("====================");
	
	
	
	
	
	

}
}