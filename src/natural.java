import java.util.Scanner;


public class natural {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("natural numbers");
		System.out.println("enter the limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.print("A");
				System.out.print(" ");
			}
			
			else if(i%5==0)
				{
					System.out.print("B");
					System.out.print(" ");
				}
			
			else
			{
		     System.out.print(" ");
			 System.out.print(i);
			 System.out.print(" ");
			}
		}
	}
			
			}
		

	


