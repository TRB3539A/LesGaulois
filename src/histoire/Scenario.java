package histoire;

import personnages.*;

public class Scenario {
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix", 15);
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		panoramix.booster(asterix);
		
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}
}
