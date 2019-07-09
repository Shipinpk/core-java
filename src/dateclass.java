import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class dateclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to print the current date and time
		
		Date d=new Date();  // you need to create date class for to print the current date and time
		
		//suppose i want to print the date and time format in order mm:dd:yy hh:mm:ss. so we want to create simpledateformat object
		
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sd.format(d));
		
		System.out.println(d.toString());
		
	     Calendar calc=Calendar.getInstance();
	     
	     System.out.println(sd.format(calc.getTime()));
	     
	     System.out.println(calc.DAY_OF_WEEK_IN_MONTH);

	}

}
