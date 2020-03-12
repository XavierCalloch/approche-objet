package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Date date = new Date(120, 2, 12);
		SimpleDateFormat formatage = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatage.format(date));
		
		Date date2 = new Date(120, 2, 12, 23, 30, 59);
		SimpleDateFormat formatage2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("");
		System.out.println(formatage2.format(date2));
		
		Date date3 = new Date(); // date/heure système
		System.out.println("");
		System.out.println(formatage2.format(date3));

	}

}
