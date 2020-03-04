package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		
		Operation operations[] = new Operation[4];
		Operation operation1 = new Credit("20/01/2020", 100.00);
		Operation operation2 = new Debit("05/01/2020", 50.00);
		Operation operation3 = new Credit("10/01/2020", 150.00);
		Operation operation4 = new Debit("25/01/2020", 40.00);
		
		operations[0] = operation1;
		operations[1] = operation2;
		operations[2] = operation3;
		operations[3] = operation4;
		
		double montantGlobal = 0.00;
		for (int i = 0; i <= operations.length - 1; i++) {
			System.out.println("Date: " + operations[i].getDate() + " - Montant: " + operations[i].getMontant() + operations[i].afficherType());
			montantGlobal = montantGlobal + arrayCompte[i].getSolde();
		}
		
		

	}

}
