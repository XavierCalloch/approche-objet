package demotestsunitaires;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {
	
	@Test
	public void testLevenshteinDistance() {
		try { // pas obligé de mettre de try/catch
			StringUtils stringUtils = new StringUtils(); // pas nécessaire
			
			CharSequence lhs = "Jva"; // pas nécessaire, indiquer en-dessous
			CharSequence rhs = "Java"; // pas nécessaire, indiquer en-dessous
			
			int resultat = stringUtils.levenshteinDistance(lhs, rhs); // "Chien"
			
			assertEquals(1, resultat);
		} catch (Exception e) {
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void testLevenshteinDistanceInverse() {
		try {
			StringUtils stringUtils = new StringUtils();
			
			CharSequence lhs = "Java";
			CharSequence rhs = "Jva";
			
			int resultat = stringUtils.levenshteinDistance(lhs, rhs);
			
			assertEquals(1, resultat);
		} catch (Exception e) {
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void testLevenshteinDistanceNull1() {
		try {
			StringUtils stringUtils = new StringUtils();
			
			CharSequence lhs = "Java";
			CharSequence rhs = null;
			
			int resultat = stringUtils.levenshteinDistance(lhs, rhs);
			
			assertEquals(-1, resultat);
		} catch (Exception e) {
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void testLevenshteinDistanceNull2() {
		try {
			StringUtils stringUtils = new StringUtils();
			
			CharSequence lhs = "";
			CharSequence rhs = "";
			
			int resultat = stringUtils.levenshteinDistance(lhs, rhs);
			
			assertEquals(0, resultat);
		} catch (Exception e) {
			fail("Not yet implemented");
		}
	}
	
	public void testLevenshteinDistanceNull5() { // throws IncorrectParameterException
		try {
			int resultat = StringUtils.levenshteinDistance("Java", "Jva");
			assertEquals(1, resultat);
		} catch (Exception e) { // mettre IncorrectParameterException e, classe d'erreur à créer
			fail();
		}
	}
	
	public void testLevenshteinDistanceNull4() { // throws IncorrectParameterException
		try {
			int resultat = StringUtils.levenshteinDistance("", "Java");
			assertEquals(4, resultat);
		} catch (Exception e) { // mettre IncorrectParameterException e, classe d'erreur à créer
			fail();
		}
	}
	
	public void testLevenshteinDistanceNull3() { // idem ci-dessus
		try {
			int resultat = StringUtils.levenshteinDistance("Java", "");
			assertEquals(4, resultat);
		} catch (Exception e) {
			fail();
		}
	}

}
