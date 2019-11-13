package fr.jeu.controller.modeJeu;

import java.util.*;

import fr.jeu.model.Grille;
import fr.jeu.model.cellule.Cellule;
import fr.jeu.view.patternObservateur.Observable;
import fr.jeu.view.patternObservateur.Observateur;

/** 
 * <b>Classe représentant une partie et son déroulement.</b>
 * 
 * <p>
 * La partie est caractérisé par :
 * <ul>
 * <li>une {@link Grille Grille} contenant la grille de jeu et la grille solution (accès en lecture et écriture)</li>
 * <li>une liste de ses {@link Observateur Observateur}</li> 
 * </ul>
 * 
 * <p>
 * Elle doit être capable de :
 * <ul>
 * <li>se créer</li>
 * <li>accéder à la grille de jeu</li>
 * <li>accéder à la grille de solution</li>
 * </ul>
 * 
 * <p>
 * Elle implémente l'interface {@link Observable Observable} ce qui lui permet de :
 * <ul>
 * <li>ajouter un observateur</li>
 * <li>retirer un observateur</li>
 * <li>mettre à jour un observateur</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class TentsAndTreesGame implements Observable {
	
	/**
	 * Grille du jeu.
	 * 
	 * <p>
	 * Elle contient la grille de jeu et la grille de solution
	 * 
	 * @see Grille
	 * @see Grille#getJouable()
	 * @see Grille#getSolution()
	 */
	protected Grille grille;
	
	/**
	 * Liste des observateurs.
	 * 
	 * @see Observable
	 * @see Observateur
	 */
	protected List<Observateur> observateurs;
	 
	/**
	 * Constructeur de {@link TentsAndTreesGame TentsAndTreesGame}.
	 * Créé la grille d'une difficulté et d'une ligne données, et la liste des observateurs.
	 * @param difficulte Difficulté de la grille de jeu.
	 * @param numero Numéro de la grille de jeu.
	 */
	public TentsAndTreesGame(String difficulte, int numero)
	{
		setGrille(new Grille(difficulte, numero));
		observateurs = new ArrayList<Observateur>();
	}
	
	/**
	 * Getter de grille.
	 * @return Une instance de la classe {@link Grille Grille}.
	 * 
	 * @see Grille
	 */
	public Grille getGrille() {
		return grille;
	}

	/**
	 * Setter de grille
	 * @param grille L'instance à mettre dans grille.
	 * 
	 * @see Grille
	 */
	public void setGrille(Grille grille) {
		this.grille = grille;
	}

	/**
	 * Méthode permettant d'avoir la grille sur laquelle on joue.
	 * @return Grille jouable.
	 * 
	 * @see Grille
	 */
	public Cellule[][] getGrilleJouable() {
		return grille.getJouable();
	}
	
	/**
	 * Méthode permettant d'avoir la grille de solution.
	 * @return Grille de solution.
	 * 
	 * @see Grille
	 */
	public Cellule[][] getGrilleSolution() {
		return grille.getSolution();
	}
	
	/**
	 * Méthode permettant d'avoir la taille des grilles avec la méthode {@link Grille#getTaille() getTaille()}.
	 * @return la taille du jeu.
	 * 
	 * @see Grille
	 */
	public int getTailleJeu()
	{
		return grille.getTaille();
	}
	
	@Override
	public void attacheObservateur(Observateur o) {
		observateurs.add(o);
		
	}

	@Override
	public void detacheObservateur(Observateur o) {
		observateurs.remove(o);
		
	}

	@Override
	public void notifieObservateurs() {
		for(Observateur obs : observateurs)
			obs.actualise();
	}

}
