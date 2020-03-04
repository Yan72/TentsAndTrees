package fr.jeu.model.cellule.patternEtat;

/** 
 * <b>Classe représentant l'état "Tente" d'une cellule.</b>
 * 
 * <p>
 * Un état Tente est caractérisé par :
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
public class CelluleEtatTente implements CelluleEtat {

	private static CelluleEtatTente etat = null;
	
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
	 * Méthode retournant l'état d'une {@link CelluleEtatTente CelluleEtatTente}.
	 * @return L'état tente.
	 */
	public static CelluleEtatTente getEtat() {
		return (etat == null ? new CelluleEtatTente(): etat);
	}

	@Override
	public String toString() {
		return "T";
	}
	
	
}
