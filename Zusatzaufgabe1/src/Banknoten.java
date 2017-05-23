import java.util.List;
import java.util.stream.Collectors;

public class Banknoten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		umwandeln();
		seriennummerKontrolle();
	}

	static String seriennummer = "Z60162200226";
	
	static List<Character> list;
	
	static int quersumme;
	
	public static void umwandeln()
	{
		list = seriennummer.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
		System.out.println(list);
	}
	
	public static void seriennummerKontrolle()
	{
		
		Integer ersterBuchstabe = list.get(0) - 'A' + 1; 
		
		for(int i=1; i < list.size()- 1; i++)
		{
			quersumme = quersumme + list.get(i)-48;
			
		}
		
		quersumme = ersterBuchstabe % 10 + ersterBuchstabe / 10 + quersumme;
		quersumme = quersumme % 9;
		quersumme = 8 - quersumme;
		
		System.out.println("Die Prüfziffer lautet " + quersumme + "!");
		
		if(list.get(11)- 48 == quersumme)
		{
			System.out.println("Die Prufziffer stimmt überein");
		}else{
			System.out.println("Die Prüfziffer stimmt nicht überein!");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
