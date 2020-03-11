package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {

	public static void main(String[] args) {
		
		// Cr�ation map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Cr�ation map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		/* 
		 * On cr�� une map appel�e map3 et qui contient l�ensemble des donn�es des 2 maps pr�c�dentes
		 * avec les m�mes cl�s et les m�mes valeurs
		 */
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);
		map3.putAll(map2);
		
		Iterator<Integer> keysIte = map3.keySet().iterator();
		while (keysIte.hasNext()) {
			int cle = keysIte.next();
			String courant = map3.get(cle);
			System.out.println(cle + " -> " + courant);
		}

	}

}
