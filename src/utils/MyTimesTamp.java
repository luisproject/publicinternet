package utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("all")
public class MyTimesTamp {
	
	private static Date parsedDate;
	
	public static Timestamp getTimestampToDB(){
		String yourString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) ;
        Timestamp timestamp = null;
		try {
			parsedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(yourString);
			timestamp = new java.sql.Timestamp(parsedDate.getTime());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
		return timestamp;
	}
}
