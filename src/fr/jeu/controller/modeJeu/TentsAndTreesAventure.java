package fr.jeu.controller.modeJeu;

import fr.jeu.model.Grille;
import fr.jeu.view.patternObservateur.Observateur;
import fr.outils.Outils;

/** 
 * <b>Classe représentant une partie Aventure et son déroulement. Elle étend la classe {@link TentsAndTreesGame TentsAndTreesGame}.</b>
 * 
 * <p>
 * La partie Aventure est caractérisé par :
 * <ul>
 * <li>une {@link Grille Grille} contenant la grille de jeu et la grille solution (accès en lecture et écriture) (héritée de {@link TentsAndTreesGame TentsAndTreesGame})</li>
 * <li>une liste de ses {@link Observateur Observateur} (héritée de {@link TentsAndTreesGame TentsAndTreesGame})</li> 
 * </ul>
 * 
 * <p>
 * Elle doit être capable de :
 * <ul>
 * <li>se créer</li>
 * </ul>
 * 
 * <p>
 * L'héritage de la classe {@link TentsAndTreesGame TentsAndTreesGame} lui permet de :
 * <ul>
 * <li>accéder à la grille de jeu</li>
 * <li>accéder à la grille de solution</li>
 * <li>ajouter un observateur</li>
 * <li>retirer un observateur</li>
 * <li>mettre à jour un observateur</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class TentsAndTreesAventure extends TentsAndTreesGame {

	/**
	 * Constucteur de {@link TentsAndTreesAventure TentsAndTreesAventure}.
	 * Fait appel au constructeur de {@link TentsAndTreesGame TentsAndTreesGame}.
	 * Ce nombre aléatoire est obtenu grâce à la méthode {@link Outils#numLigne(String) numLigne} de la classe {@link Outils Outils}.
	 * @param difficulte La difficulté de la grille souhaitée.
	 * @param numero Numéro de la ligne à laquelle il faut chercher la grille.
	 */
	public TentsAndTreesAventure(String difficulte, int numero) {
		super(difficulte, numero);
	}

}
