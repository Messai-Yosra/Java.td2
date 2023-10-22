package cours;

public class main {
	public static void main(String[] args) {
		L2Vector y = new L2Vector();
		etudiant e1 =new etudiant(1,"yosra","messai");
		etudiant e2 =new etudiant(2 ,"aziz" ,"makhlouf");
		
		y.ajouterEtudiant(e1);
		y.afficherEtudiants();
		y.supprimerEtudiant(e1);
		System.out.println("L'Etudiant est supprimé");
		y.ajouterEtudiant(e2);
		y.ajouterEtudiant(e1);
		System.out.println("La recherche est : "+y.rechercherEtudiant(e2));
		
	}

}
