import java.util.ArrayList;


public class arraylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//arrayList,linked list and vector are the interfaces
		//array list can add duplicate values

		//arraylist is dynamic in nature,we can add elements into array list what ever we want.
		// but in array the size is fixed one
		
		ArrayList<String> list=new ArrayList<String>();// we are passing the argument as String in that list.like we can add integer
		list.add("india");
		list.add("america");
		list.add("usa");
		list.add("china");
		list.add("nepal");
		
		System.out.println(list);//this will print all the details in arraylist
		
		list.add(0,"shipin"); // so this can be helpful for adding an argument in 0 index as shipin.
		
		System.out.println(list);
		
		//suppose i want to remove the 5 th index of value
		list.remove(5);
		
		//suppose i want to test this string is present in that list
		System.out.println(list.contains("testing"));
		
		for(String s:list)
		{
			System.out.println(s);
		}

	}

}
