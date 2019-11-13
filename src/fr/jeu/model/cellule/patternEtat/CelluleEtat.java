package fr.jeu.model.cellule.patternEtat;

/** 
 * <b>Interface définissant les comportements communs aux différents états possibles d'une cellule (Design Pattern Etat).</b>
 * 
 * <p>
 * Un état de cellule est capable de :
 * <ul>
 * <li>se changer en herbe</li>
 * <li>se changer en tente</li>
 * <li>se changer en vide</li>
 * <li>renvoyer sa valeur</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public interface CelluleEtat {
	
	/**
	 * Methode permettant de changer l'état en herbe (sauf à partir d'un état arbre qui lui ne peut être changé).
	 * @return L'état {@link CelluleEtatHerbe CelluleEtatHerbe}
	 */
	public CelluleEtat placerHerbe();
	
	/**
	 * Methode permettant de changer l'état en tente (sauf à partir d'un état arbre qui lui ne peut être changé).
	 * @return L'état {@link CelluleEtatTente CelluleEtatTente}
	 */
	public CelluleEtat placerTente();
	
	/**
	 * Methode permettant de changer l'état en vide (sauf à partir d'un état arbre qui lui ne peut être changé).
	 * @return L'état {@link CelluleEtatVoid CelluleEtatVoid}
	 */
	public CelluleEtat placerVoid();
}
