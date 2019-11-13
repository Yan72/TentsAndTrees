package fr.jeu.model.cellule.patternEtat;

/** 
 * <b>Classe représentant l'état "Herbe" d'une cellule.</b>
 * 
 * <p>
 * Un état Herbe est caractérisé par :
 * <ul>
 * <li>une unique instance permettant de manipuler cet état sans dupliquer les instances (Design Pattern du Singletton)</li>
 * </ul>
 * 
 * <p>
 * Il doit etre capable de :
 * <ul>
 * <li>Donner son Singleton</li>
 * </ul>
 * 
 * <p>
 * Il implémente l'interface {@link CelluleEtat CelluleEtat} ce qui lui permet de :
 * <ul>
 * <li>placer une herbe</li>
 * <li>placer une tente</li>
 * <li>passer la case à vide (void)</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class CelluleEtatHerbe implements CelluleEtat {
	
	private static CelluleEtatHerbe etat = null;
	
	@Override
	public CelluleEtat placerHerbe() {
		return CelluleEtatHerbe.getEtat();
	}

	@Override
	public CelluleEtat placerTente() {
		return CelluleEtatTente.getEtat();
	}

	@Override
	public CelluleEtat placerVoid() {
		return CelluleEtatVoid.getEtat();
	}
	
	/**
	 * Méthode retournant l'état d'une {@link CelluleEtatHerbe CelluleEtatHerbe}.
	 * @return L'état herbe.
	 */
	public static CelluleEtatHerbe getEtat() {
		return (etat == null ? new CelluleEtatHerbe(): etat);
	}
	
	@Override
	public String toString() {
		return "H";
	}
}
