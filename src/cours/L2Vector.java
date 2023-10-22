package cours;

import java.util.Collection;
import java.util.Vector;

public class L2Vector implements Université{
	Collection<etudiant> Myset =new Vector<etudiant>();
	
	@Override
	public void ajouterEtudiant(etudiant e) {
		Myset.add(e);
		
	}


	@Override
	public boolean rechercherEtudiant(etudiant e) {
		
		return Myset.contains(e);
	}

	@Override
	public boolean rechercherEtudiant(String nom) {
		for(etudiant e : Myset) {
			if (e.getNom().equals(nom)){
			return true;		
			}
		}
		return false;
		
	}






	@Override
	public void supprimerEtudiant(etudiant e) {
		
		Myset.remove(e);
		
	}






	@Override
	public void afficherEtudiants() {
		for(etudiant e : Myset) {
			System.out.println(e.toString());
		
		}
	}	






	@Override
	public void trierEtudiantsParId() {
		// TODO Auto-generated method stub
		
	}






	@Override
	public void trierEtudiantsParNom() {
		// TODO Auto-generated method stub
		
	}}
