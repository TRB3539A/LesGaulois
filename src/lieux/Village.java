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
		System.out.println("Dans le village du chef " + this.chef.getNom() + " vivent les l�gendaires gaulois :");
		for(int i=1; i<=this.nbVillageois; i++) {
			System.out.println("- " + this.trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irr�ductibles", 30);
		// Gaulois gaulois = village.trouverHabitant(30);
		// On obtient une exception car on a pas encore ajout� de villageois et encore moins le 30�me!!!
		Chef abraracourcix = new Chef("Abraracourcix", 1, 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		village.ajouterHabitant(asterix);
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		// Cela va afficher le 1er gaulois que l'on a ajout� au village, ici Ast�rix
		
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
