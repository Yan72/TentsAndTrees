package fr.tentsandtrees;

import fr.jeu.view.interfaces.TentsAndTreesTerm;

public class Test {
	
	public static void main(String[] args)
	{
		TentsAndTreesTerm jeu = new TentsAndTreesTerm();
		jeu .actualise();
	}
}

/**
 * NOTE À MOI MÊME, PACKAGE GRILLE = MODÈLE, PACKAGE MODESDEJEU = CONTROLLEUR, PACKAGE INTERFACE = VUE 
 * LE RESTE, C LES PATTERNS
 * 
 * REMARQUE : UN OBSERVATEUR PEUT CONTENIR LE CONTROLLEUR POUR COMMUNIQUER AVEC LE MODÈLE
 */
 


/**kzdkjdkqss
 * A faire : - finir la mise à niveau de la java doc (fait jusqu'à Grille)
 * 			 - continuer le passage en MVC (passer l'affichage présent dans Grille dans TentsAndTreesTerm && mettre les getteurs pour les tab de  ligne et col && enlever les get/set inutiles pour le moment)
 * 			 - mettre au clair sur qui utilise quelle classe à quel moment + autres
 */
