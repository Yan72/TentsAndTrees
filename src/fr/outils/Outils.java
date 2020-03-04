package fr.outils;

import fr.jeu.model.cellule.Cellule;

/** 
 * <b>Classe contenant des outils de développement.</b>
 * 
 * @author Yann Paulmery
 * 
 */
public class Outils {

	/**
	 * Méthode permettant de trouver un numéro de ligne aléatoirement dans la difficulté voulue.
	 * @param difficulte La difficulté souhaitée.
	 * @return Une valeur de ligne aléatoire.
	 */
	public static int numLigne(String difficulte)
	{
		int maxLigne = (difficulte == "Difficile" ? 300 : 400);
		return (int)(Math.random() * maxLigne + 1);
	}
	
	/**
	 * Méthode de comparaison de 2 grilles.
	 * @param grille1 Première grille.
	 * @param grille2 Deuxième grille.
	 * @param taille Taille des grilles
	 * @return <i>true</i> si les grilles sont identiques, <i>false</i> sinon.
	 */
	public static boolean comparerGrilles(Cellule[][] grille1, Cellule[][] grille2, int taille)
	{
		for (int i = 0; i < taille; i++)
			for(int j = 0; j < taille; j++)
				if (grille1[i][j] != grille2[i][j])
					return false;
		return true;
	}
}
