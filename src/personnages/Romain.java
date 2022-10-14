package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.force > 0 : "La force d’un Romain est toujours positive";	
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
		
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
		
	public void recevoirCoup(int forceCoup) {
		assert this.force > 0 : "La force du Romain doit être positive";
		int temp = this.force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert temp > this.force : "La force du Romain a diminué";
	}
	
	public void sEquiper(Equipement equipement) {
		switch(this.nbEquipement) {
		
			case 2: 
				System.out.println("Le soldat " + this.nom + " est déjà bien protégé!");
				break;
			
			case 1:
				if (this.equipements[this.nbEquipement-1] == equipement) {
					System.out.println("Le soldat " + this.nom + " possède déjà un " + equipement + "!");
					break;
				}
			
			default:
				this.nbEquipement++;
				this.equipements[this.nbEquipement-1] = equipement;
				System.out.println("Le soldat " + this.nom + " s'équipe d'un " + equipement + ".");
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.prendreParole();
		minus.parler("Salut");
		minus.recevoirCoup(4);
		minus.recevoirCoup(3);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}

}
