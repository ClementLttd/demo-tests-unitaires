package fr.diginamic.maison;

public class Maison {
	private Piece[] pieces;

	public Maison() {

		pieces = new Piece[0];
	}

	public Piece ajouterPiece(Piece nvPiece) {

		if (nvPiece == null || nvPiece.getNumEtage() < 0 || nvPiece.getSuperficie() < 0) {
			System.out.println("Votre pièce est incorrecte");
			return null;
		}

		Piece[] newTab = new Piece[pieces.length + 1];

		for (int i = 0; i < pieces.length; i++) {
			newTab[i] = pieces[i];

			newTab[newTab.length - 1] = nvPiece;

			this.pieces = newTab;
		}
		return nvPiece;

	}

	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (choixEtage == this.pieces[i].getNumEtage()) {
				superficieEtage = superficieEtage + this.pieces[i].getSuperficie();
			}
		}

		return superficieEtage;
	}
	
	public double superficieTypePiece(String typePiece) {
		double superficie = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (typePiece!=null && typePiece.equals(this.pieces[i].getType())) {
				superficie = superficie + this.pieces[i].getSuperficie();
			}
		}

		return superficie;
	}
	
	public double calculerSurface() {
		double superficieTot = 0;

		for (int i = 0; i < pieces.length; i++) {
			superficieTot = superficieTot + this.pieces[i].getSuperficie();
		}

		return superficieTot;
	}
}
