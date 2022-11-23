package histoire;

import lieux.Musee;
import objet.Equipement;
import personnages.*;

public class Scenario {
	
	public static void main(String[] args) {
//		Druide panoramix = new Druide("Panoramix", 5, 10);
//		panoramix.parler("Je vais aller pr�parer une petite potion...");
//		panoramix.preparerPotion();
//		Gaulois obelix = new Gaulois("Ob�lix", 15);
//		panoramix.booster(obelix);
//		obelix.parler("Par B�l�nos, ce n'est pas juste !");
//		Gaulois asterix = new Gaulois("Ast�rix", 8);
//		panoramix.booster(asterix);
//		
//		Romain minus = new Romain("Minus", 6);
//		asterix.parler("Bonjour");
//		minus.parler("UN GAU... UN GAUGAU...");
//		asterix.frapper(minus);
//		asterix.frapper(minus);
//		asterix.frapper(minus);
		
		
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller pr�parer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		druide.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
		} while (milexcus.getForce() > 0);
		
		Musee musee = new Musee();
		asterix.faireUneDonnation(musee);
	}
}
