package personnages;

import lieux.Musee;
import objet.Equipement;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}

	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée. ");
	}
	
	public void faireUneDonnation(Musee musee) {
		if (this.nbTrophees > 0) {
			this.parler("Je donne au musee tous mes trophees :");

			for (int i = 0; trophees[i] != null && i < this.nbTrophees; i++) {
				System.out.println("- " + trophees[i]);
				musee.donnerTrophees(this, trophees[i]);
			}
		}

	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		
		asterix.prendreParole();
		asterix.parler("Bonjour");
		Romain leRomain = new Romain("leRomain", 5);
		asterix.frapper(leRomain);
		
		asterix.boirePotion(4);
	}
}
