	import java.time.LocalDateTime; 
	import java.time.format.DateTimeFormatter; 
	import java.time.format.FormatStyle; 
	import java.time.LocalDate; 
	
public class Datumsstempel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		formatDate();
	}
	        
	     
	public static void formatDate() { 
			/*
			 * Die Methode now() der Klasse LocalDate gibt dir das aktuelle Datum aus.
			 */
	        LocalDate date = LocalDate.now(); 
	        System.out.print(date);											// 2016-01-31
	        
	        // Der DateTimeFormatter formatiert deine Datumsangabe in bestimmte Formate.
	        
	        DateTimeFormatter df; 											
	        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);       // Ausgabe in der Form: Sonntag, 31. Januar 2016 
	        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);       // Ausgabe in der Form: 31. Januar 2016 
	        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);     // Ausgabe in der Form: 31.01.2016 
	        df = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);      // Ausgabe in der Form: 31.01.16 
	        
	        // Die Ausgabe erfolgt dann indem am Objekt Date (indem dein Datum enthalten ist) die Methode format() aufgerufen wird. 
	        // Als Parameter wird der DateTimeFormatter, welcher eben angelegt wurde, uebergeben.
	        
	        System.out.println(date.format(df));
	        
	        
	        
	        /*
			 * Die Methode now() der Klasse LocalDateTime gibt dir das aktuelle Datum UND die Zeit aus aus.
			 */
	        LocalDateTime now = LocalDateTime.now(); 

	        df = DateTimeFormatter.ISO_LOCAL_DATE;    						// Ausgabe in der Form: 2016-18-31 
	        df = DateTimeFormatter.ISO_DATE_TIME;     						// Ausgabe in der Form: 2016-01-31T20:07:07.095    
	        df = DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm");     		// Ausgabe in der Form: 31.01.2016 20:07    
	        System.out.println(now.format(df)); 
	         
	    } 
}
