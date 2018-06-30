package javaBookMath;

import java.sql.Date;

public class EvacuateException extends Exception{
	
	static Date date;
	
	public EvacuateException(Date d) {
		
		super("Evacutation of zone " + date);
		
	}

}
