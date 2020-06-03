package model;

public abstract class Product{

	
//Chaque produit est défini par un identifiant, un titre et un tarif journalier.
 protected String title;
 protected float tarifjournalier;
 protected int identifiant;
 
 
 
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public float getTarifjournalier() {
	return tarifjournalier;
}
public void setTarifjournalier(float tarifjournalier) {
	this.tarifjournalier = tarifjournalier;
}
public int getIdentifiant() {
	return identifiant;
}
public void setIdentifiant(int identifiant) {
	this.identifiant = identifiant;
}
 
public Product(String title, int identifiant,float tarifjournalier) {
	this.title=title;
	this.tarifjournalier=tarifjournalier;
	this.identifiant=identifiant;
}
}
