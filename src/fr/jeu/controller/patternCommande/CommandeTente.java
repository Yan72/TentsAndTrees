package fr.jeu.controller.patternCommande;

import fr.jeu.model.cellule.Cellule;

/** 
 * <b>Classe représentant la commande pour placer une tente. Elle étend la classe abstraite {@link Commande Commande}.</b>
 * 
 * <p>
 * Une CommandeTente est caractérisé par :
 * <ul>
 * <li>la cellule sur laquelle elle s'applique (héritée de la classe abstraite {@link Commande Commande})</li>
 * </ul>
 * 
 * <p>
 * Elle doit être capable de :
 * <ul>
 * <li>se créer</li>
 * </ul>
 * 
 * <p>
 * L'héritage lui permet de :
 * <ul>
 * <li>s'éxecuter</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class CommandeTente extends Commande {

	/**
	 * Constructeur de {@link CommandeTente CommandeTente}.
	 * @param c La cellule conscernée.
	 *
	 * @see Cellule
	 */
	public CommandeTente(Cellule c) {
		cellule = c;
	}

	/**
	 * Redéfinission de la méthode d'exécution.
	 * 
	 * @see Commande
	 * @see Cellule#placerTente()
	 */
	@Override
	public void executer() {
		cellule.placerTente();
	}

}
