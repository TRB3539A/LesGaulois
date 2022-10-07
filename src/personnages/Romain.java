package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.force > 0 : "La force d�un Romain est toujours positive";	
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
		
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
		
	public void recevoirCoup(int forceCoup) {
		assert this.force > 0 : "La force du Romain doit �tre positive";
		int temp = this.force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert temp > this.force : "La force du Romain a diminu�";
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", -6);
		minus.prendreParole();
		minus.parler("Salut");
		minus.recevoirCoup(4);
		minus.recevoirCoup(3);
	}

}
