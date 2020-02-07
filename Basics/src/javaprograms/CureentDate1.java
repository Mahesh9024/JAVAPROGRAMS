package javaprograms;

import java.util.Calendar;

public class CureentDate1 {

	public static void main(String[] args) {

		
		Calendar cal = Calendar.getInstance();
		String date = Integer.toString(cal.get(Calendar.MONTH))+ " " + Integer.toString(cal.get(Calendar.DATE))+ " "+ Integer.toString(cal.get(Calendar.YEAR));
		System.out.println("Current Date is: "+date);
		
		//To print Time
		String time = Integer.toString(cal.get(Calendar.HOUR)) + " " + Integer.toString(cal.get(Calendar.MINUTE)) + " " + Integer.toString(cal.get(Calendar.SECOND));
		System.out.println("Current time is: "+time);
		
				
	}

}
