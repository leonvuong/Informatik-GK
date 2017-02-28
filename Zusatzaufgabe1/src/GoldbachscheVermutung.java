import java.util.ArrayList;
import java.util.List;
public class GoldbachscheVermutung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primzahlenBekommen();
		primzahlenInList();
		geradeZahl();
	}

	int primzahl1;
	int primzahl2;
	int geradeZahl;
	static int obereSchranke = 100;
	static List<Integer> geradeZahlenList = new ArrayList<Integer>();
	static List<Integer> primzahlenList = new ArrayList<Integer>();
	static Primzahlsieb prim = new Primzahlsieb(100);
	
	public static void primzahlenBekommen()
	{
		prim.primzahlenBerechnen();
		
	}
	
	public static void primzahlenInList()
	{
		for(int j=0; j< prim.sieb.length;j++)
		{
			if(prim.sieb[j] == true)
			{
				primzahlenList.add(j);
			}
		}
	}
	
	public static void geradeZahl()
	{
		for(int i=2; i < obereSchranke; i= i + 2)
		{
			geradeZahlenList.add(i);
		}
		
	}
	
}
