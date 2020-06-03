package model;

public class Dictionnaire extends Document{
	
protected String langue;

public Dictionnaire(String title, int identifiant, float tarifjournalier, String langue) {
	super(title, identifiant, tarifjournalier);
	this.langue=langue;
	// TODO Auto-generated constructor stub
}

public String getLangue() {
	return langue;
}

public void setLangue(String langue) {
	this.langue = langue;
}

}
