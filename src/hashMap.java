import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class hashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * differnce between hashmap and hashtable
		 * hashmap is not sysnchronized and it is not thread safe.
		 * hashtable possible to sysch and it is thread safe.(it will execute every thread complete)
		 * hashmap will allow null values and it will accepts, but in hashtable it will not accepts null values
		 * hashmap have iterator interface , but in hashtable it have enumerator to iterate
		 */
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>(); // hashmap is a key-value pair. first one is key and second value will store into first one

		hm.put(0,"hello");
		hm.put(1,"gudbye");
		hm.put(2,"morning"); 
		hm.put(7, null);// accept null values
		hm.put(3,"evening");
		
		System.out.println(hm.get(3));
		
		Set sn=hm.entrySet(); // entry set means it will create a set data structure like hasmap
		
		Iterator it=sn.iterator(); // in hashmap it will create a iterator
		
		while(it.hasNext()) // key and value will be stored in set data structure, so we can seprate from key and value
		{
			Map.Entry mp=(Map.Entry)it.next(); // it will cast to hashmap data structure, so we can print separate value and key
			
			System.out.println(mp.getValue());
			System.out.println(mp.getKey());
		}
		
	}

}
