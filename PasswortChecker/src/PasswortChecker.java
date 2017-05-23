import java.util.List;
import java.util.stream.Collectors;

public class PasswortChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	static String passwort = "Abc123"; //Passworteingabe
	
	
	static List<Character> list;
	
	static boolean istKleinbuchstabeDa = false;
	static boolean istGro�buchstabeDa = false;
	static boolean istZahlDa = false;
	static boolean istSonderzeichenDa = false;
	
	public static void umwandeln()
	{
		list = passwort.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
		System.out.println(list);
	}

	public static void passwortChecker(){
		//�berpr�fung der L�nge des Passwortes.
		if (list.size() > 7) {
			�berpr�fung();
		} else{
			System.out.println("Das Passwort ist nicht lang genug!");
		}
		
	}
	
	public static void �berpr�fung(){       //Mindestens eine Zahl, Kleinbuchstabe, Gro�buchstabe und Sonderzeichen
		for(int i=0; i< list.size();i++)
		{
			if (Character.isLowerCase(list.get(i))){
				istKleinbuchstabeDa = true;
				}else if (Character.isUpperCase(list.get(i))){
					istGro�buchstabeDa = true;
					}else if (Character.isDigit(list.get(i))){
						istZahlDa = true;
						}else{
							istSonderzeichenDa = true;
							}
			}
		if (istKleinbuchstabeDa == true && istGro�buchstabeDa == true && istZahlDa == true && istSonderzeichenDa == true){
			System.out.println("Das Passwort ist Super geil und sicher!!!");
			
		}else{
			System.out.println("Das Passwort ist noch nicht super geil.");
		}
	
		//Untersuchung, welche Sicherheitsmerkmale nicht erf�llt sind.
		
			if(istKleinbuchstabeDa==false){
				System.out.println("Es fehlt ein Kleinbuchstabe.");
			}
	
			if(istGro�buchstabeDa==false){
				System.out.println("Es fehlt ein Gro�buchstabe.");
			}
	
			if(istZahlDa==false){
				System.out.println("Es fehlt eine Zahl.");
			}
	
			if(istSonderzeichenDa==false){
				System.out.println("Es fehlt ein Sonderzeichen.");
			}
	
	}
}
