package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.DAY_OF_MONTH, 12);
		
		Date date = cal.getTime();
		
		SimpleDateFormat formattage = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formattage.format(date));
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2020);
		cal2.set(Calendar.MONTH, 2);
		cal2.set(Calendar.DAY_OF_MONTH, 12);
		cal2.set(Calendar.HOUR_OF_DAY, 23);
		cal2.set(Calendar.MINUTE, 30);
		cal2.set(Calendar.SECOND, 59);
		
		Date date2 = cal2.getTime();
		
		SimpleDateFormat formattage2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("");
		System.out.println(formattage2.format(date2));
		
		Calendar cal3 = Calendar.getInstance();
		Date date3 = cal3.getTime(); // date/heure système
		System.out.println("");
		System.out.println(formattage2.format(date3));

	}

}
