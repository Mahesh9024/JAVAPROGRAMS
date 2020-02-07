package javaprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDate2 {

	public static void main(String[] args) {

		DateFormat dateformat = new SimpleDateFormat();
		DateFormat dateformat1 = new SimpleDateFormat("YYYY/MM/dd hh:mm:ss");		
		Date date = new Date();
		
		System.out.println(dateformat.format(date));
		
		System.out.println(dateformat1.format(date));
		
		//3rd  way of  printing date and time
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/DD/YYYY");
		LocalDate ldate = LocalDate.now();
		System.out.println(dtf.format(ldate));
		
				
		
		
		
		
		
		
	}

}
