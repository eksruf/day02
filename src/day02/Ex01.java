package day02;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
//	final String KOREA = "대한민국";
//	System.out.println(KOREA);
//	KOREA = "케나다";
//	System.out.println(KOREA);
	
//	Scanner input = new Scanner(System.in);
//	System.out.print("이름입력: ");
//	String name = 변수.next();
//	int age;
//	System.out.println("나이입력: ");
//	age = 변수.nextInt();
//
//	
//	System.out.println(name + "님의 나이는 " + age);
//	
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("당신의 이름은 무엇입니까?");
	String name = input.next();
	
	//int kor, eng, math; 라고 작성해도 실행 가능
	
	System.out.println(name+"님의 국어 점수:");
	int kor;
	kor = input.nextInt();
	
	System.out.println(name+"님의 영어 점수: ");
	int eng;
	eng = input.nextInt();
	
	System.out.println(name+"님의 수학 점수: ");
	int math;
	math = input.nextInt();
	
//	int total;
//	total = korea+eng+math;
	
	System.out.println("====================");
	System.out.println("이름 : "+name);
	System.out.println("====================");
	System.out.println("국어 : "+kor);
	System.out.println("영어 : "+eng);
	System.out.println("수학 : "+math);
	System.out.println("====================");
	System.out.println("합계 : "+(kor+eng+math));
	System.out.println("====================");
	
	
	
	

}
}
