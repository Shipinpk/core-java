
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]={{2,5,8},{3,7,1},{9,4,6}};
		int min=a[0][0];
		int mincoloumn=0;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					mincoloumn = j;
				}
			}
		}
		//System.out.println(min);
		int k = 0;
        int max=a[0][mincoloumn];
        while(k<3)
        {
        	
		if(a[k][mincoloumn]>max)
		{
			
			max=a[k][mincoloumn];
		}
        k++;
        }
        System.out.println(max);
	}

}
