import java.util.ArrayList;
import java.util.List;

public class Getraenke extends GastMaske{

	/**
	 * 
	 * Kaffearten in Array Listen
	 * 
	 */
	
	//Variablen deklarieren.
	
	
	public List <String> kaffeartList = new ArrayList<String>();
	public List <String> milchartList = new ArrayList<String>();
	public List <String> becherartList = new ArrayList<String>();
	public List <String> groeﬂenList = new ArrayList<String>();
	public List <String> zuckerartList = new ArrayList<String>();
	
	public Integer kaffeeart;
	public Integer milchart;
	public Integer becherart;
	public Integer groeﬂe;
	public Integer zuckerart;
	
	
	public Getraenke(Integer kaffe, Integer milch, Integer becher, Integer groesse, Integer zucker)
	{
		werteInListHinzufuegen();
		kaffeeart = kaffe;
		milchart = milch;
		becherart = becher;
		groeﬂe = groesse;
		zuckerart = zucker;
	}
	
	public void werteInListHinzufuegen()
	{
		//Kaffearten
		
		kaffeartList.add("schwarzer Kaffe ");
		kaffeartList.add("Milchkaffe ");
		kaffeartList.add("Cappucino ");
		kaffeartList.add("Espresso ");
		kaffeartList.add("Eiskaffe ");
		kaffeartList.add("Kakao ");
	
		//Milch
		
		milchartList.add("Vollmilch ");
		milchartList.add("fettarme Milch ");
		milchartList.add("soja Milch ");
		milchartList.add("keine Milch ");
		
		//Becherart
		
		becherartList.add("Pappbecher ");
		becherartList.add("Plastikbecher ");
		
		//Groeﬂe
		
		groeﬂenList.add("S ");
		groeﬂenList.add("M ");
		groeﬂenList.add("L ");
		groeﬂenList.add("XL ");
		
		//Zucker
		
		zuckerartList.add("keinZucker ");
		zuckerartList.add("weiﬂer Zucker ");
		zuckerartList.add("brauner Zucker ");
		zuckerartList.add("Stevia ");
		zuckerartList.add("Sueﬂstoff ");
	}

}
