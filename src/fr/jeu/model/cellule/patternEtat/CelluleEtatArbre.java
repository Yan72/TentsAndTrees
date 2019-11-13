package fr.jeu.model.cellule.patternEtat;

/** 
 * <b>Classe représentant l'état "Arbre" d'une cellule.</b>
 * 
 * <p>
 * Un état Arbre est caractérisé par :
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
 * Il implémente l'interface {@link CelluleEtat CelluleEtat} mais ne peut jamais être changé. Les méthodes héritées ne font donc rien.
 *  
 * @author Yann Paulmery
 * 
 */
public class CelluleEtatArbre implements CelluleEtat {

	private static CelluleEtatArbre etat = null;
	
	@Override
	public CelluleEtat placerHerbe() {
		return CelluleEtatArbre.getEtat();
	}

	@Override
	public CelluleEtat placerTente() {
		return CelluleEtatArbre.getEtat();
	}

	@Override
	public CelluleEtat placerVoid() {
		return CelluleEtatArbre.getEtat();
	}
	
	/**
	 * Méthode retournant l'état d'une {@link CelluleEtatArbre CelluleEtatArbre}.
	 * @return L'état arbre.
	 */
	public static CelluleEtatArbre getEtat() {
		return (etat == null ? new CelluleEtatArbre(): etat);
	}
	
	@Override
	public String toString() {
		return "A";
	}

}
