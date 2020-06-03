package model;

public class ClientOccasionnel extends Client{
	private final double reduction = 0;
	
	public ClientOccasionnel(String nom, String prenom, int identifiantClient) {
		super(nom, prenom, identifiantClient);
		// TODO Auto-generated constructor stub
	}
	
	public double getReduction() {
		return reduction;
	}

}
