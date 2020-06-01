package model;

public abstract class Livre extends Document{
//Dans la catégorie des livres, il y a trois types de produits : les romans, les manuels scolaires
//	et les BD.	
	protected String auteur;

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	
}
