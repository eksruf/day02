package day02;

import java.util.Scanner;

public class Quiz4 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("1.�ݶ�");
	System.out.println("2.��Ƽ");
	System.out.println("3.Ŀ��");
	
	System.out.println("���� �Է��ϼ���");
	int su = input.nextInt();
	
	if (su == 1)
		System.out.println("�ݶ� �����ϼ̽��ϴ�");
	if (su == 2)
		System.out.println("��Ƽ�� �����ϼ̽��ϴ�");
	if (su == 3)
		System.out.println("Ŀ�Ǹ� �����ϼ̽��ϴ�");
}
}
