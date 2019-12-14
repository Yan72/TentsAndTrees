package fr.jeu.controller;

import fr.jeu.controller.modeJeu.TentsAndTreesGame;
import fr.jeu.model.grille.Grille;
import fr.jeu.view.patternObservateur.Observateur;
import fr.outils.Outils;

/** 
 * <b>Classe représentant un observateur de partie.</b>
 * Cet observateur est particulier car il n'entre pas dans la Vue comme les autres Observateurs mais dans le Controleur
 * 
 * <p>
 * Un observateur de partie est caractérisé par :
 * <ul>
 * <li>le jeu {@link TentsAndTreesGame TentsAndTreesGame} qu'il observe </li>
 * <li>un booléen déterminant la fin ou non d'une partie</li>
 * </ul>
 * 
 * <p>
 * Elle doit etre capable de :
 * <ul>
 * <li>se créer</li>
 * <li>accéder </li>
 * <li>se créer</li>
 * </ul>
 * 
 * <p>
 * Elle implémente l'interface {@link Observateur Observateur} ce qui lui permet de :
 * <ul>
 * <li>s'actualiser</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class ObservateurPartie implements Observateur {
	
	/**
	 * Jeu observé.
	 * 
	 * <p>
	 * Ce jeu permet d'accéder à la grille.
	 * 
	 * @see TentsAndTreesGame
	 * @see Grille
	 * 
	 * @see ObservateurPartie#grilleTerminee()
	 */
	private TentsAndTreesGame jeu;
	
	/**
	 * Fin de la partie.
	 * 
	 * <p>
	 * Booléen passant à <i>true</i> quand la partie se termine.
	 * 
	 * @see ObservateurPartie#grilleTerminee()
	 * @see ObservateurPartie#isFin()
	 * @see ObservateurPartie#setFin(boolean)
	 */
	private boolean fin = false;
	
	/**
	 * Constructeur de {@link ObservateurPartie ObservateurPartie}.
	 * @param jeu Le jeu à observer.
	 * 
	 * @see ObservateurPartie#jeu
	 */
	public ObservateurPartie(TentsAndTreesGame jeu) {
		this.jeu = jeu;
	}

	/**
	 * Getteur de {@link ObservateurPartie#fin fin}.
	 * @return <i>true</i> si la partie est terminée, <i>false</i> sinon.
	 */
	public boolean isFin() {
		return fin;
	}

	/**
	 * Setteur de {@link ObservateurPartie#fin fin}.
	 * @param fin Instance à mettre dans {@link ObservateurPartie#fin fin}.
	 */
	public void setFin(boolean fin) {
		this.fin = fin;
	}
	

	/**
	 * Méthode de comparaison de la grille de jeu et de la grille de solution permettant de déterminer si une grille est terminée ou pas.
	 * @return <i>true</i> si les grilles sont identiques, <i>false</i> sinon. 
	 * 
	 * @see Grille
	 * 
	 * @see ObservateurPartie#jeu
	 */
	public boolean grilleTerminee()
	{
		return Outils.comparerGrilles(jeu.getGrilleJouable(), jeu.getGrilleSolution(), jeu.getTailleJeu());
	}

	@Override
	public void actualise() {
		setFin(this.grilleTerminee());
	}

}
