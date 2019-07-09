
public class thisDemo {

	int a=2; // so i am declaring a global variable a
	
	
	public void getData()
	{
		int a=3;// so this variable have scope only in the method. (local variable)
		
		System.out.println(a);
		
		System.out.println(this.a); // by this keyword we can call the global variable from here
		
		int c=a+this.a;
		
		System.out.println("sum ="+c);
				
	}
	
	public static void main(String[] args) {
		
		thisDemo th=new thisDemo();
		th.getData(); // so i am calling getdata method

	}

}
