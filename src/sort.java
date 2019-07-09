import java.util.Scanner;


public class sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[];
		int i,n,j,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("sorting of given array");
		System.out.println("enter the size of an array");
		n=s.nextInt();
		System.out.println("enter the array elements");
		a=new int[n];
	   for(i=0;i<n;i++)
	   {
		  a[i]=s.nextInt();
		  
		}
	  
	   for(i=0;i<n;i++)
	   {
		   for(j=i+1;j<n;j++)
		   {
			   if(a[i]>a[j])
			   {
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				   
			   }
		   }
		   
	   }
	  
	   System.out.println("array after sorting");
		for(i=0;i<n;i++)
		{
			System.out.println(+a[i]);
		}
		
		
	}

}
