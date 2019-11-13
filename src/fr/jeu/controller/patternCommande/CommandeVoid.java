package fr.jeu.controller.patternCommande;

import fr.jeu.model.cellule.Cellule;

/** 
 * <b>Classe représentant la commande pour placer du vide. Elle étend la classe abstraite {@link Commande Commande}.</b>
 * 
 * <p>
 * Une CommandeVoid est caractérisé par :
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
public class CommandeVoid extends Commande {

	/**
	 * Constructeur de {@link CommandeVoid CommandeVoid}.
	 * @param c La cellule conscernée.
	 *
	 * @see Cellule
	 */
	public CommandeVoid(Cellule c) {
		cellule = c;
	}
	
	/**
	 * Redéfinission de la méthode d'exécution.
	 * 
	 * @see Commande
	 * @see Cellule#placerVoid()
	 */
	@Override
	public void executer() {
		cellule.placerVoid();
	}

}
