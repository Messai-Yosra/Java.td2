package cours;

public class etudiant {
	private int id ;
	private String nom ;
	private String prenom ;
	
	
	public etudiant(){
		
	}
	public etudiant (int id , String nom , String prenom){
		this.id=id ;
		this.nom=nom ;
		this.prenom=prenom ;
	
		
	}
	public int getId() {
        return this.id;
    }
	public String getNom() {
        return this.nom;
    }
   public String getPrenom() {
	   return this.prenom;
   	}
	
   public void setId(int id) {
       this.id = id;
   
   }
   
   public void setNom(String nom) {
       this.nom = nom;
   
   }
   public void setPrenom(String prenom) {
    this.prenom = prenom;
       
   }
   public boolean equals(etudiant e) {
	   return this.id==e.id ;
      
   }
   public String toString() {
	   return "[ Id: "+this.id+
			  " Nom: "+this.nom+  
			  " Prenom: "+this.prenom+" ]";
		  
   }
   
   
   
   
   
   
   
   
   
}