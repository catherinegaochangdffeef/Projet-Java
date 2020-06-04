package storage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import model.*;

/**
 * Cette classe est utilisée pour gérer tout ce qui concerne la vidéothèque, à
 * travers des fichiers json.
 *
 */
public final class Videotheque {
	public static final File dossierDonnees = new File("data");
	public static final File dossierClients = new File(Videotheque.dossierDonnees, "clients");

	// Constructeur vide, toutes les méthodes de cette classe sont statiques pour
	// simplifier son utilisation
	private Videotheque() {
		return;
	}

	// On enregistre un client dans un simple fichier JSON, renvoie vrai si
	// l'enregistrement a eu lieu, faux sinon
	public static boolean ajouterClient(Client client) {
		Videotheque.dossierDonnees.mkdirs();
		Videotheque.dossierClients.mkdirs();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonClient = gson.toJson(client);
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(Videotheque.dossierClients, "client" + client.getIdentifiantClient() + ".json")))) {
			bufferedWriter.write(jsonClient);
			bufferedWriter.flush();
			System.out.println("Le client a été ajouté avec succès!");
			return true;
		} catch (IOException ioException) {
			System.err.println("Une exception a été levée pendant l'enregistrement d'un nouveau client!");
			ioException.printStackTrace();
		}
		return false;
	}

	@SuppressWarnings({ "unchecked" })
	public static boolean ajouterProduitAuStock(Product produit) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File fichierProduits = new File(Videotheque.dossierDonnees, "produits.json"), fichierStock = new File(Videotheque.dossierDonnees, "stock.json");
		if (!fichierProduits.exists()) {
			System.out.println("Création du fichier des produits...");
			try {
				fichierProduits.createNewFile();
			} catch (IOException ioException) {
				System.err.println("Une exception a été levée pendant la création du fichier des produits!");
				ioException.printStackTrace();
				return false;
			}
		}
		if (!fichierStock.exists()) {
			System.out.println("Création du fichier des stocks...");
			try {
				fichierStock.createNewFile();
			} catch (IOException ioException) {
				System.err.println("Une exception a été levée pendant la création du fichier des stocks!");
				ioException.printStackTrace();
				return false;
			}
		}
		try {
			Map<String, Product> produits = gson.fromJson(new FileReader(fichierProduits), Map.class);
			if (produits == null) {
				produits = new HashMap<String, Product>();
			}
			produits.put(String.valueOf(produit.getTitle() + " [" + produit.getClass().getSimpleName() + "]"), produit);
			try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fichierProduits))) {
				bufferedWriter.write(gson.toJson(produits));
				bufferedWriter.flush();
				System.out.println("Le produit a été ajouté à la liste avec succès!");
			} catch (IOException ioException) {
				System.err.println("Une exception a été levée pendant l'enregistrement d'un nouveau produit!");
				ioException.printStackTrace();
			}
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException exception) {
			System.err.println("Une exception a été levée pendant la lecture du fichier des produits!");
			exception.printStackTrace();
			return false;
		}
		try {
			Map<String, String> stockParIdentifiant = gson.fromJson(new FileReader(fichierStock), Map.class);
			if (stockParIdentifiant == null) {
				stockParIdentifiant = new HashMap<String, String>();
			}
			int nombreEnStock = Integer.valueOf(stockParIdentifiant.getOrDefault(String.valueOf(produit.getIdentifiant()), "0")) + 1;
			stockParIdentifiant.put(String.valueOf(produit.getIdentifiant()), String.valueOf(nombreEnStock));
			try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fichierStock))) {
				bufferedWriter.write(gson.toJson(stockParIdentifiant));
				bufferedWriter.flush();
				System.out.println("La quantité en stock du produit a été augmentée!");
				return true;
			} catch (IOException ioException) {
				System.err.println("Une exception a été levée pendant l'augmentation du stock du produit!");
				ioException.printStackTrace();
			}
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException exception) {
			System.err.println("Une exception a été levée pendant la lecture du fichier des produits!");
			exception.printStackTrace();
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public static List<String> listeProduits() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		List<String> disponibiliteDesProduits = new ArrayList<String>();
		File fichierProduits = new File(Videotheque.dossierDonnees, "produits.json"), fichierStock = new File(Videotheque.dossierDonnees, "stock.json");
		Map<String, Product> produits;
		Map<String, String> stockParIdentifiant;
		if (!fichierProduits.exists()) {
			System.out.println("Création du fichier des produits...");
			try {
				fichierProduits.createNewFile();
			} catch (IOException ioException) {
				System.err.println("Une exception a été levée pendant la création du fichier des produits!");
				ioException.printStackTrace();
			}
		}
		if (!fichierStock.exists()) {
			System.out.println("Création du fichier des stocks...");
			try {
				fichierStock.createNewFile();
			} catch (IOException ioException) {
				System.err.println("Une exception a été levée pendant la création du fichier des stocks!");
				ioException.printStackTrace();
			}
		}
		try {
			produits = gson.fromJson(new FileReader(fichierProduits), Map.class);
			stockParIdentifiant = gson.fromJson(new FileReader(fichierStock), Map.class);
			for (String cle : produits.keySet()) {
				System.out.println(cle + ", " + stockParIdentifiant.get(cle));
				int quantite = Integer.valueOf(stockParIdentifiant.get(cle));
				String statut = "Produit: " + cle + ", en stock: " + quantite + " (" + (quantite > 0 ? "DISPONIBLE)" : "INDISPONIBLE)");
				System.out.println(statut);
				disponibiliteDesProduits.add(statut);
			}
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException exception) {
			System.err.println("Une exception a été levée pendant la lecture des fichiers produits + stock!");
		}
		return disponibiliteDesProduits;
	}

	public static void main(String[] args) {
		ClientOccasionnel client1 = new ClientOccasionnel("Morize", "Vincent", 69420);
		Videotheque.ajouterClient(client1);
		Livre lePetitPrince = new Roman("Le Petit Prince", 1, 5.0F, "Exupéry");
		Livre artemisFowl = new Roman("Artemis Fowl", 2, 10.0F, "Eoin Colfer");
		Videotheque.ajouterProduitAuStock(lePetitPrince);
		Videotheque.ajouterProduitAuStock(artemisFowl);
		Videotheque.listeProduits();
	}
}