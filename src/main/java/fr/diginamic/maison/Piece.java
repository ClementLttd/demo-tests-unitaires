package fr.diginamic.maison;

public abstract class Piece {
	
	private double superficie;
	private int numEtage;
	
	public static final String TYPE_CHAMBRE = "Chambre";
	public static final String TYPE_SALON = "Salon";
	public static final String TYPE_CUISINE = "Cuisine";
	public static final String TYPE_WC = "WC";
	public static final String TYPE_SDB = "Salle de bain";
	
	
	public Piece (double superficie, int numEtage) {
		this.superficie=superficie;
		this.numEtage=numEtage;
	}
	
	public abstract String getType();

	
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}

}
