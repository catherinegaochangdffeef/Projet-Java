package model;

public abstract class Livre extends Document{
//Dans la cat�gorie des livres, il y a trois types de produits : les romans, les manuels scolaires
//	et les BD.	
	protected String auteur;

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Livre(String title, int identifiant, float tarifjournalier, String auteur) {
		super(title, identifiant, tarifjournalier);
		this.auteur=auteur;
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		return super.toString()+"Livre {" + "Auteur = " + auteur;
	}
}
