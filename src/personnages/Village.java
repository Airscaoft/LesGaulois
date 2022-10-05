package personnages;

public class Village{
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum){
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMaximum];
	}
	
	public void ajouterHabitant(Gaulois g) {
		villageois[nbVillageois]=g;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void main(String[] args){
		Village village = new Village(nom="Village des irr�ductibles", 30);
		
	}

}
