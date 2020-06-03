package model;

public class CD extends SupportNumerique{
protected int AnneeDeSortie;

public CD(String title, int identifiant, float tarifjournalier, int AnneeDeSortie) {
	super(title, identifiant, tarifjournalier);
	this.AnneeDeSortie=AnneeDeSortie;
	// TODO Auto-generated constructor stub
}

public int getAnneeDeSortie() {
	return AnneeDeSortie;
}

public void setAnneeDeSortie(int anneeDeSortie) {
	AnneeDeSortie = anneeDeSortie;
}

}
