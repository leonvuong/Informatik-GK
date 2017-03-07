import java.util.ArrayList;
import java.util.List;
public class GoldbachscheVermutung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primzahlenBekommen();
		primzahlenInList();
		geradeZahl();
		System.out.println("Primzahlen " + primzahlenList);
		System.out.println("Gerade Zahlen " + geradeZahlenList);
		addition();
	}

	int primzahl1;
	int primzahl2;
	int geradeZahl;
	static int obereSchranke = 100000;
	static List<Integer> geradeZahlenList = new ArrayList<Integer>();
	static List<Integer> primzahlenList = new ArrayList<Integer>();
	static Primzahlsieb prim = new Primzahlsieb(obereSchranke);
	
	
	public static void primzahlenBekommen() //Berechnung von Primzahlen.
	{
		prim.primzahlenBerechnen();
		
	}
	
	public static void primzahlenInList() //Einsetzen der Primzahlen in eine List.
	{
		for(int j=0; j< prim.sieb.length;j++)
		{
			if(prim.sieb[j] == true)
			{
				primzahlenList.add(j);
			}
		}
	}
	
	public static void geradeZahl() //Berechnung von allen geraden Zahlen bis zur oberen Schranke.
	{
		for(int i=2; i < obereSchranke; i= i + 2)
		{
			geradeZahlenList.add(i);
		}
		
	}
	
	public static void addition() //Addition von zwei Primzahlen zu einer geraden Zahl.
	{
		boolean abbruch = false;
		for(int k=0; k< geradeZahlenList.size(); k++)
		{
			for(int l=0; l< primzahlenList.size(); l++)
			{
				for(int m=0; m< primzahlenList.size(); m++)
				{
					if(primzahlenList.get(l) + primzahlenList.get(m) == geradeZahlenList.get(k))
					{
						System.out.println(primzahlenList.get(l) + "+" + primzahlenList.get(m) + "=" + geradeZahlenList.get(k));
						abbruch=true;
						break;
					}
				}
			if(abbruch)
			{
				abbruch = false;
				break;
			}
			}
		}
	}
}
