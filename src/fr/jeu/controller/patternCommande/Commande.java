package fr.jeu.controller.patternCommande;

import fr.jeu.model.cellule.Cellule;

/** 
 * <b>Classe abstraite définissant servant de base aux classes commandes filles (Design Pattern Commande).</b>
 * 
 * <p>
 * Une commande est caractérisé par :
 * <ul>
 * <li>la cellule sur laquelle elle s'applique</li>
 * </ul>
 * 
 * <p>
 * Il doit être capable de :
 * <ul>
 * <li>s'éxecuter</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public abstract class Commande {
	
	/**
	 * Cellule à modifier
	 * 
	 * <p>
	 * Cette cellule est celle sur laquelle doit s'appliquer la commande
	 * 
	 * @see Cellule
	 */
	protected Cellule cellule;
	
	/**
	 * Méthode permettant d'appliquer une action sur la cellule voulue.
	 */
	public abstract void executer();
}