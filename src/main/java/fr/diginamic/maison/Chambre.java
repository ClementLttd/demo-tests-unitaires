package fr.diginamic.maison;

public class Chambre extends Piece {

	public Chambre(int numEtage, double superficie) {
		super(superficie, numEtage);
	}

	@Override
	public String getType() {
		return TYPE_CHAMBRE;
	}

}
