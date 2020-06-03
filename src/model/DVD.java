package model;

public class DVD extends SupportNumerique {
protected String Realisateur;

public DVD(String title, int identifiant, float tarifjournalier, String Realisateur) {
	super(title, identifiant, tarifjournalier);
	this.Realisateur=Realisateur;
	// TODO Auto-generated constructor stub
}

public String getRealisateur() {
	return Realisateur;
}

public void setRealisateur(String realisateur) {
	Realisateur = realisateur;
}

}
