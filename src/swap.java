import java.util.Scanner;


public class swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("swaping without using third var");
		Scanner s=new Scanner(System.in);
		System.out.println("enter two number");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("before swaping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
