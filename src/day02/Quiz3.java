package day02;

import java.util.Scanner;

public class Quiz3 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	

	
	System.out.println("국어와 영어점수를 적어주세요: ");
	
	double kor, eng;
	
	kor = input.nextInt();
	eng = input.nextInt();
	

	if(((kor+eng)/2)>80)
	{
		System.out.println("합격");
	}
	if (((kor+eng)/2)<=80)
	{
		System.out.println("불합격");
	}
}
}



