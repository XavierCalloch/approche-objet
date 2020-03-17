package maison;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class MaisonTest {

//	@Before
//	public static void setUpBeforeClass() {
//		Maison maison = new Maison(); // ou faire une fixture
//		Piece chambre = new Chambre(10.0, 1);
//		Piece cuisine = new Cuisine(10.0, 1);
//		Piece salleDeBain = new SalleDeBain(5.0, 1);
//		Piece salon = new Salon(20.0, 1);
//		Piece wc = new WC(3.0, 1);
//	}
	
	@Test
	public void testAjouterPiece() {
		Maison maison = new Maison(); // ou faire une fixture
		Piece chambre = new Chambre(10.0, 1);
		Piece cuisine = new Cuisine(10.0, 1);
		Piece salleDeBain = new SalleDeBain(5.0, 1);
		Piece salon = new Salon(20.0, 1);
		Piece wc = new WC(3.0, 1);
		maison.ajouterPiece(chambre);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salleDeBain);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(wc);
		int pieces = maison.getPieces().length;
		assertEquals(5, pieces);
	}

	@Test
	public void testGetSuperficieTotale() {
		Maison maison = new Maison(); // ou faire une fixture
		Piece chambre = new Chambre(10.0, 1);
		Piece cuisine = new Cuisine(10.0, 0);
		Piece salleDeBain = new SalleDeBain(5.0, 0);
		Piece salon = new Salon(20.0, 0);
		Piece wc = new WC(3.0, 0);
		maison.ajouterPiece(chambre);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salleDeBain);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(wc);
		double resultat = maison.getSuperficieTotale();
		assertEquals(48.0, resultat, 0.0001);
	}

	@Test
	public void testGetSuperficieEtage() {
		Maison maison = new Maison(); // ou faire une fixture
		Piece chambre = new Chambre(10.0, 1);
		Piece cuisine = new Cuisine(10.0, 0);
		Piece salleDeBain = new SalleDeBain(5.0, 0);
		Piece salon = new Salon(20.0, 0);
		Piece wc = new WC(3.0, 0);
		maison.ajouterPiece(chambre);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salleDeBain);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(wc);
		double resultat = maison.getSuperficieEtage(0);
		assertEquals(38.0, resultat, 0.0001);
	}
	
	@Test
	public void testGetSuperficieTotalePieceNull() {
		Maison maison = new Maison(); // ou faire une fixture
		Piece chambre = new Chambre(0.0, 1);
		maison.ajouterPiece(chambre);
		double resultat = maison.getSuperficieTotale();
		assertEquals(0.0, resultat, 0.0001);
	}
	
	@Test
	public void testGetSuperficieTotaleSuperfPieceNeg() {
		Maison maison = new Maison(); // ou faire une fixture
		Piece chambre = new Chambre(-5.0, 0);
		maison.ajouterPiece(chambre);
		double resultat = maison.getSuperficieTotale();
		assertEquals(0.0, resultat, 0.0001);
	}

}
