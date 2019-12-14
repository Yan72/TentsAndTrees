package fr.jeu.model.indicateurs;

/** 
 * <b>Classe représentant un tableau d'indicateur (de ligne ou de colonne).</b>
 * 
 * <p>
 * Un tableau d'indicateur est caractérisé par :
 * <ul>
 * <li>un tableau d'entier</li>
 * </ul>
 * 
 * <p>
 * Il doit etre capable de :
 * <ul>
 * <li>se créer</li>
 * <li>renvoyer son tableau d'entier</li>
 * <li>renvoyer une valeur de son tableau</li>
 * <li>modifier une valeur de son tableau</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class TableauIndicateurs {
	
	/**
	 * Tableau d'entier.
	 * 
	 * <p>
	 * Tableau d'indicateurs de nombre de tente sur une ligne ou un colonne.
	 */
	private int [] tab;

	/**
	 * Constructeur de {@link TableauIndicateurs TableauIndicateurs}.
	 * Initialise le tableau d'entiers avec sa taille. 
	 * @param taille Taille du tableau à créer, égale à la taille de la grille.
	 */
	public TableauIndicateurs(int taille) {
		this.tab = new int[taille];
	}

	/**
	 * Getteur 
	 * @return the tab
	 */
	public int [] getTab() {
		return tab;
	}
	
	public void setValTab(int indice, int val)
	{
		tab[indice] = val;
	}
	
	public int getValTab(int indice)
	{
		return tab[indice];
	}
}
