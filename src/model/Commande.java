package model;
import java.util.ArrayList;
import model.Emprunt;

public class Commande {
	private static int nocommande=0;
	
	ArrayList<Emprunt>CollectionEmprunt;
	
	public Commande() {
		CollectionEmprunt = new ArrayList<Emprunt>();
		setNocommande(getNocommande() + 1);
	}

	public void AjouterEmprunt(Emprunt e) {
        CollectionEmprunt.add(e);
    }
	
	public void Afficher() {
		System.out.println("----------------------------------------------------------------------------------");
	for(Emprunt e : CollectionEmprunt) {
		System.out.println(e.toString());
	}
		System.out.println("----------------------------------------------------------------------------------");
	}

	public int getNocommande() {
		return nocommande;
	}

	private static void setNocommande(int newnocommande) {
		nocommande = newnocommande;
	}
}
	