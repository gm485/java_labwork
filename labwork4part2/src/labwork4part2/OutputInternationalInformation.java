package labwork4part2;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Set;

/**
 * 
 */
public class OutputInternationalInformation {
	
	//english standard locale setting
	static Locale enLocale = new Locale("en", "EN");
	
	//creating three different locale
	static Locale cslocale = new Locale("cs", "CS");
	static Locale esLocale = new Locale("es", "ES");
	static Locale arLocale = new Locale("ar", "AR");
	
	//import method to change locale
	static DateFormatSymbols dfs = new DateFormatSymbols(enLocale);
	
	
	public static void main(String[] args) {
		
		//days of week to be changed
		//
		//String array for days of the week to be converted
		String dayNames[] = dfs.getWeekdays();
		//show days of the week from locale setting
		localizedDaysOfWeek(dayNames);
		
		//change to Czech locale
		changeCzechLocale(enLocale);
		
		//print days of week in Czech
		localizedDaysOfWeek();
			
	}
	
	//method to change text and info to different region
	public String displayLocalizedInformation(String locale) {
		return locale;
		
	}
	//print through the days of the week and return string array
	public static String[] localizedDaysOfWeek(String[] daysOfWeek, Locale lcl) {
		
		
		
		/*
		for (int i=0; i<7; i++)
	    {
	    	System.out.println(daysOfWeek[i+1]);
	    }
		return daysOfWeek;
	}
	*/
	//method to change enLocale variable to Czech 
	public static Locale changeCzechLocale(Locale lcl) {
		lcl = cslocale;
		return lcl;
	}
	public static Locale changeArabicLocale(Locale lcl) {
		lcl = arLocale;
		return lcl;
	}
}


