import java.util.HashSet;
import java.util.Iterator;


public class hashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    //hashset, treeset, linkedhashset are the hashset interfaces
		//cannot accept the duplicate values
		// its not a sequenceial order, may be its random.
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("uk");
		hs.add("usa");
		hs.add("india");
		hs.add("heee");
		hs.add("shee");
	//	System.out.println(hs);
		
	//	System.out.println(hs.size());//size of hashset array
	  //  System.out.println(hs.remove("america"));// boolean value return 
	  //  System.out.println(hs.isEmpty()); // is it empty it returns true nor false
		
		Iterator<String> i=hs.iterator(); // create an iterator object to go through all values
		
		while(i.hasNext()) // hasnext means that it will check the set structure if any index is present or not
		{
			System.out.println(i.next());
		}
		
		
	}

}
