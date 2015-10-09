import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 
 */

/**
 * @author iaw47647361
 *
 */
public class CotxeMaps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Auto-generated method stub
		//
		SortedMap <String, Cotxe> mapa = new TreeMap<String, Cotxe>();
		//Afegim els 8 objectes
		mapa.put("1234 AAA", new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		mapa.put("2321 BBB", new Cotxe("Seat", "Ibiza", 1200, 3));
		mapa.put("8232 FFF", new Cotxe("Ford", "Focus", 2000, 4));
		mapa.put("3311 FFF", new Cotxe("Ford", "Mondeo", 2200, 4));
		mapa.put("9381 LLL", new Cotxe("Seat", "Leon", 1600, 4));
		mapa.put("B 9011 XC", new Cotxe("Hyundai", "Atos", 1500, 3));
		mapa.put("9234 BHG", new Cotxe("Hyundai", "Santa Fe", 3000, 6));
		mapa.put("9216 CKK", new Cotxe("Hyundai", "Accent", 2900, 4));
		
		Cotxe afegit = new Cotxe();
		afegit = mapa.put("9216 CKK", new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		//si s'ha pogut afegir retorna null sino retorna un altre valor
		if(afegit == null){
			System.out.println("sí s'ha afegit un duplicat");
		} else {
			System.out.println("no s'ha afegit un duplicat");
		}
		for(Map.Entry<String, Cotxe> entry : mapa.entrySet()){
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}
}
}
