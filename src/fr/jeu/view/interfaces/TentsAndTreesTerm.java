package fr.jeu.view.interfaces;

import java.util.Scanner;

import fr.jeu.controller.ObservateurPartie;
import fr.jeu.controller.modeJeu.TentsAndTreesClassique;
import fr.jeu.controller.modeJeu.TentsAndTreesGame;
import fr.jeu.view.patternObservateur.Observateur;

/** 
 * <b>Classe représentant l'interface du jeu dans un terminal.</b>
 * 
 * <p>
 * L'interface est représentée par :
 * <ul>
 * <li>une instance de {@link TentsAndTreesGame TentsAndTreesGame} représentant le jeu et permettant à celle ci de s'acualiser</li>
 * </ul>
 * 
 * <p>
 * Elle doit être capable de :
 * <ul>
 * <li>se créer</li>
 * </ul>
 * 
 * <p>
 * L'héritage de la classe {@link ObservateurPartie ObservateurPartie} lui permet de :
 * <ul>
 * <li>s'actualiser</li>
 * <li></li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class TentsAndTreesTerm implements Observateur {
	
	private TentsAndTreesGame jeu;

	/**
	 * Getteur de jeu.
	 * @return Une instance de la classe {@link TentsAndTreesGame TentsAndTreesGame}
	 * @see TentsAndTreesGame
	 */
	public TentsAndTreesGame getJeu() {
		return jeu;
	}

	/**
	 * Setter de jeu
	 * @param jeu L'instance à mettre dans jeu.
	 * @see TentsAndTreesGame
	 */
	public void setJeu(TentsAndTreesGame jeu) {
		this.jeu = jeu;
	}

	public TentsAndTreesTerm() {
		super();
	}

	@Override
	public void actualise() {
		Scanner sc;
		System.out.println("Entrez une difficulté : ");
		sc = new Scanner(System.in);
		String dif = sc.nextLine();
		sc.close();
		TentsAndTreesGame jeu = new TentsAndTreesClassique(dif);
		System.out.println(jeu.getGrille());
	}

}
