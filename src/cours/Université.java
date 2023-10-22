package cours;

public interface Université {
	public void ajouterEtudiant(etudiant e); 
	public boolean rechercherEtudiant(etudiant e); 
	public boolean rechercherEtudiant(String nom); 
	public void supprimerEtudiant(etudiant e); 
	public void afficherEtudiants(); 
	public void trierEtudiantsParId(); 
	public void trierEtudiantsParNom();

}
