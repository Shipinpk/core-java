import java.util.Scanner;


public class pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("pattern printing");
		System.out.println("enter the number of rows");
		n=sc.nextInt();
		System.out.println();
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
        System.out.println();
        System.out.println("reverse pattern");
        System.out.println("enter the number of rows");
        n=sc.nextInt();
      
        for(i=n;i>0;i--)
        {
        	for(j=i;j>0;j--)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
