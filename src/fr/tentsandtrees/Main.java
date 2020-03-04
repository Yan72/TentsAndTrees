package fr.tentsandtrees;

import fr.jeu.view.interfaces.TentsAndTreesTerm;

public class Main {
	
	public static void main(String[] args)
	{
		TentsAndTreesTerm jeu = new TentsAndTreesTerm();
		jeu.actualise();
	}
}

/**
 * REMARQUE : UN OBSERVATEUR PEUT CONTENIR LE CONTROLLEUR POUR COMMUNIQUER AVEC LE MODÈLE
 */


/**
 * A faire : - finir la mise à niveau de la java doc (fait jusqu'à Grille)
 * 			 - continuer le passage en MVC (passer l'affichage présent dans Grille dans TentsAndTreesTerm && mettre les getteurs pour les tab de  ligne et col && enlever les get/set inutiles pour le moment)
 * 			 - mettre au clair sur qui utilise quelle classe à quel moment + autres
 */

/**  
 * Note : Le git est fonctionnel
 */
