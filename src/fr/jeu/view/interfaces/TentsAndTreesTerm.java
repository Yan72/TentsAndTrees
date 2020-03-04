package fr.jeu.view.interfaces;

import java.util.Arrays;
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
	
	public TentsAndTreesTerm() {
		Scanner sc;
		
		sc = new Scanner(System.in);
		System.out.println("Entrez un modede jeu : ");
		String mode = sc.nextLine();
		System.out.println("Entrez une difficulté : ");
		String dif = sc.nextLine();
		sc.close();
		switch(mode)
		{
		case "Classique":
			jeu = new TentsAndTreesClassique(dif);
			break;
		case "Aventure":
			jeu = new TentsAndTreesClassique(dif);
			break;
		case "Compétition":
			jeu = new TentsAndTreesClassique(dif);
			break;
		}
		
	}

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

	@Override
	public void actualise() {
		
		
		String s = "nbTentesColonnes=" + Arrays.toString(jeu.getGrille().getNbTentesColonnes().getTab()) + ", nbTentesLignes=" + Arrays.toString(jeu.getGrille().getNbTentesColonnes().getTab()) + "\n";
		
		s = s + "\n Jouable : \n  " + "   | " ;
		
		for (int i = 0; i < jeu.getGrille().getTaille(); i++) {
			s = s + i + " | " ;
		}
		s = s + "\n     | ";
		
		for (int i = 0; i < jeu.getGrille().getTaille(); i++) {
			s = s + jeu.getGrille().getNbTentesColonnes().getValTab(i) + " | " ;
		}
		s = s + "\n";
		
		for (int j = 0; j < jeu.getGrille().getTaille() * 2 + 3; j++)
			s = s + "--";
		s = s + "\n";
		
		for (int i = 0; i < jeu.getGrille().getTaille(); i++) {
			s = s + " " + i + " " + jeu.getGrille().getNbTentesColonnes().getValTab(i) + " | ";
			for (int j = 0; j < jeu.getGrille().getTaille(); j++) {
				s = s + jeu.getGrille().getJouableVal(i, j) + " | ";
			}
			s = s + "\n";
			for (int j = 0; j < jeu.getGrille().getTaille() * 2 + 3; j++)
				s = s + "--";
			s = s + "\n";
		}
		System.out.println(s);
	}

}
