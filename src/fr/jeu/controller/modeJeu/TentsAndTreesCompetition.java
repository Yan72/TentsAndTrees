package fr.jeu.controller.modeJeu;

import fr.jeu.model.Grille;
import fr.jeu.view.patternObservateur.Observateur;
import fr.outils.Outils;

/** 
 * <b>Classe représentant une partie Compétition et son déroulement. Elle étend la classe {@link TentsAndTreesGame TentsAndTreesGame}.</b>
 * 
 * <p>
 * La partie Compétition est caractérisé par :
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
public class TentsAndTreesCompetition extends TentsAndTreesGame {
	
	/**
	 * Constucteur de {@link TentsAndTreesCompetition TentsAndTreesCompetition}.
	 * Fait appel au constructeur de {@link TentsAndTreesGame TentsAndTreesGame} avec comme numéro de ligne un nombre aléatoire.
	 * Ce nombre aléatoire est obtenu grâce à la méthode {@link Outils#numLigne(String) numLigne} de la classe {@link Outils Outils}.
	 * @param difficulte La difficulté de la grille souhaitée.
	 */
	public TentsAndTreesCompetition(String difficulte) {
		super(difficulte, Outils.numLigne(difficulte));
	}
}
