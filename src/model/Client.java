package model;

public abstract class Client {
	//Les clients de la vidioth�que sont d�nis par un identifiant, un
	//nom et un pr�nom.
protected String nom;
protected String prenom;
protected int identifiantClient;

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getIdentifiantClient() {
	return identifiantClient;
}
public void setIdentifiantClient(int identifiantClient) {
	this.identifiantClient = identifiantClient;
}
public Client(String nom, String prenom, int identifiantClient) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.identifiantClient = identifiantClient;
}

}
