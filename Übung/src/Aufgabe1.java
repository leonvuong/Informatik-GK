
public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ungerade(7);
	}
	static String beliebigerString;
	
	static int eineZahl;
	
	static int nochEineZahl;
	
	static int ergebnis;
	
	static double eineZahlMitKomma = 4.7;
		
	public static void rechenspiele()
	{
		eineZahl=4;
		nochEineZahl=4;
		ergebnis = eineZahl * nochEineZahl; 
	
		if(ergebnis < eineZahlMitKomma)
		{
			double differenz = ergebnis - eineZahlMitKomma;
			System.out.print("Die Differenz ist"+ differenz);
			}else{
				System.out.print("Das ergebnis ist zu klein!");
				}
		
	}

	public static void ungerade(int ende) 
	{
		int ungeradeZahl=1;
		while(ungeradeZahl<ende){
				System.out.println("Die Zahl lautet "+ ungeradeZahl);
				ungeradeZahl = ungeradeZahl + 2;
		}
	
	}
	
}



