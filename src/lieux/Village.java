package lieux;

import personnages.*;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageois = 0;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois g) {
		this.villageois[this.nbVillageois] = g;
		this.nbVillageois ++;
	}
	
	public Gaulois trouverHabitant(int nbVillageois) {
		return this.villageois[nbVillageois-1];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + this.chef.getNom() + " vivent les légendaires gaulois :");
		for(int i=1; i<=this.nbVillageois; i++) {
			System.out.println("- " + this.trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		// On obtient une exception car on a pas encore ajouté de villageois et encore moins le 30ème!!!
		Chef abraracourcix = new Chef("Abraracourcix", 1, 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		// Cela va afficher le 1er gaulois que l'on a ajouté au village, ici Astérix
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
