
public class GetraenkeVersuch1 extends GastMaske {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kaffeeBestaetigen();
	}
	
	/** 
	*
	* Variablen deklarieren.
	*
	*/
	
	//Kaffesorte mit ersten Zahl = 1.
	static Integer schwarzerKaffe = 11;
	static Integer milchkaffe = 12;
	static Integer cappucino = 13;
	static Integer espresso = 14;
	static Integer eiskaffe = 15;
	static Integer kakao = 16;
	
	//Milchsorte mit ersten Zahl = 2.
	static Integer vollmilch = 21;
	static Integer fettarmeMilch = 22;
	static Integer sojaMilch = 23;
	static Integer keineMilch = 24;
	
	//Becher mit ersten Zahl = 3.
	static Integer pappbecher = 31;
	static Integer plastikbecher = 32;
	
	//Groe�e mit ersten Zahl = 4
	static Integer groe�eS = 41;
	static Integer groe�eM = 42;
	static Integer groe�eL = 43;
	static Integer groe�eXL = 44;
	
	//Zucker mit ersten Zahl = 5
	static Integer keinZucker = 51;
	static Integer wei�erZucker = 52;
	static Integer braunerZucker = 53;
	static Integer stevia = 54;
	static Integer sue�stoff = 55;
	
	/**
	 *  
	 *  Methoden der Klasse Getraenke.
	 *  
	 */
	
	//Best�tigung des Kaffes
	public static void kaffeeBestaetigen()
	{
		kaffeartButtonGroup.getSelection();
	}
	//Methode Zahlvorgang.
	public static void zahlvorgang()
	{
		
	}
}
