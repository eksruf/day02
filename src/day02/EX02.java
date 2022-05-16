package day02;

public class EX02 {
public static void main(String[] args) {
	int num1 = 9,  num2 = 2;
	System.out.println(num1 / num2);
	System.out.println(num1 / (double)num2);
	System.out.println(num1 /2.0);
	System.out.println( num1 % num2);
	
	/*
	 ���ճ��Կ�����
	 a=10 , b=5;
	 a= a+b; => a+=b;
	 a= a*b; => a*=b
	 */
	
	int a =10, b=5;
	a+=b;
	System.out.println(a);
	
	int su1,su2;
	su1 = su2 = 5;
	
	System.out.println(su1+=1); //  6 = 5+1(su1 = su1+1)
	System.out.println(su1-=1);  // 5 = 6-1(su1= su1-1)
	System.out.println(su1*=su2); // 25 = 5*5 (su1 =su1*su2)
	System.out.println(su1/=su2); // 5 = 25/5 (su1 = su1/su2)
	System.out.println(su1%=su2); // ������0 = 5%5  (su1 = su1%su2)
	
	
	/*
	 ���迬���� : ��������δ� �� (true)�Ǵ� ����(false)
	 
	 a=10, b=5;
	 a>b : true
	 a<=b : false
	 a==b : false
	 a != b :true (�����ʴ� , !�� ������ ���Ѵ�.)
	 
	 10>5>2 : ��� ����
	 ���迬���ڴ� ���׿������̸� ������ ���� �� �����ڰ� 2�� �´�.
	 
	 
	 */
	
	System.out.println("===========================");
	double do1 = 3.1, do2= 3.0;
	System.out.println(do1 <= do2);  //f
	System.out.println(do1 >= do2);  //t
	System.out.println(do1 == do2);  //f
	System.out.println(do1 != do2);  //t
	
	
	
	/*
	����������: �� �Ǵ� ���� ���
	&&(and) : ��ΰ� ���϶� ��
	||(or) : �ϳ��� ���̸� ��
	!(not): ���������ش�.
	
	 
	 */
	
	int su3;
	su1 =10 ; su2 =20;  su3= 30;
	
	System.out.println(su1> su2 && su1> su3);
	System.out.println("====and====");
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	 
	System.out.println("====or====");
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("===not===");
	System.out.println( !true);
	System.out.println( !false);
	
	/*
	 ���� ������ : ��������� �ڱ��ڽ��� 1���� �Ǵ� ����
	 
	 a==10;
	 ++a :��ġ �Ǵ� ����
	 a++ :��ġ �Ǵ� ����
	 a++, ++a => a=a+1;
	 a--, --a => a=a-1;
	 */
	
	System.out.println("====����������=====");
	su1 =10 ;
	su1++;
	System.out.println(su1);
	
	su1 =10 ;
	++su1;
	System.out.println(su1);
	
	
	su1= 10;
	su2= su1++;
	System.out.println("su1 : "+su1);
	System.out.println("su2 : "+su2);
	
	su1= 10;
	su2= ++su1;
	System.out.println("su1 : "+su1);
	System.out.println("su2 : "+su2);
	
	
	/*
	 ���׿�����(���ǿ�����)
	 ���� = �� ? ��(��) : ����(��);
	 
	 */
	System.out.println("===���׿�����====");
	
	su1= 11;
	String s = (su1%2==0)?"¦��":"Ȧ��";
	System.out.println(su1 + s);
	
	
	
	System.out.println("���� �Է��ϼ��� : ");
	
	
	
	
}
}