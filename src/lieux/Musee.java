package lieux;

import objet.Equipement;
import objet.Trophee;
import personnages.Gaulois;

public class Musee {
	private Trophee[] trophee = new Trophee[200];
	private int nbTrophee;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		Trophee tab = new Trophee(gaulois, equipement);
		this.trophee[nbTrophee] = tab;
		this.nbTrophee ++;
	}
	
	public void extraireInstructionsCaml() {
		String guillemet = "\"";
		String virgule = ",";
		String pointvirgule = ";";
		StringBuilder nom = new StringBuilder();
		nom.append("let musee = [");
		for (int i = 0; i < this.nbTrophee; i++) {
			nom.append(' ');
			nom.append(guillemet);
			nom.append(trophee[i].donnerNom());
			nom.append(guillemet);
			nom.append(virgule);
			nom.append(' ');
			nom.append(guillemet);
			nom.append(trophee[i].getEquipement());
			nom.append(guillemet);
			if (i + 1 != this.nbTrophee) {
				nom.append(pointvirgule);
			}

		}
		nom.append(" ]");
		System.out.println(nom);
	}
}
