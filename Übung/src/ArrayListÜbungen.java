import java.util.ArrayList;
import java.util.List;
public class ArrayList‹bungen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		monateInitialisierung();
		tageImMonatInitialisierung();
		monatTag();
	}

	static List <String> wochentage = new ArrayList<String>();
	
	public static void wochentageInitialisierung(){
		wochentage.add("Montag");
		wochentage.add("Dienstag");
		wochentage.add("Mittwoch");
		wochentage.add("Donnerstag");
		wochentage.add("Freitag");
		wochentage.add("Samstag");
		wochentage.add("Sonntag");
	}
	
	public static void dankeMerkel(){
		wochentage.set(wochentage.indexOf("Freitag"), "NochNichtFreitag");
	}

	public static void ausgebenAllerWochentage(){
		for(int i = 0; i < wochentage.size();i++){
			
			System.out.println(wochentage.get(i));
		}
	}

	static List <String> monate = new ArrayList<String>();
	static List <String> tageImMonat = new ArrayList<String>();
	
	public static void monateInitialisierung(){
		
		monate.add("Januar");
		monate.add("Februar");
		monate.add("M‰rz");
		monate.add("April");
		monate.add("Mai");
		monate.add("Juni");
		monate.add("Juli");
		monate.add("August");
		monate.add("September");
		monate.add("Oktober");
		monate.add("November");
		monate.add("Dezember");
		
	}
	
	public static void tageImMonatInitialisierung(){
		
		tageImMonat.add("31");
		tageImMonat.add("28");
		tageImMonat.add("31");
		tageImMonat.add("30");
		tageImMonat.add("31");
		tageImMonat.add("30");
		tageImMonat.add("31");
		tageImMonat.add("31");
		tageImMonat.add("30");
		tageImMonat.add("31");
		tageImMonat.add("30");
		tageImMonat.add("31");
	}

	public static void monatTag(){
		for(int i=0; i< monate.size(); i++){
			System.out.println("Der Monat "  + monate.get(i)  + " hat genau " + tageImMonat.get(i) + " Tage!");
		}
		
	}
}


