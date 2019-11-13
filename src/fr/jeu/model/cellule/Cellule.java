package fr.jeu.model.cellule;

import fr.jeu.model.cellule.patternEtat.CelluleEtat;
import fr.jeu.model.cellule.patternEtat.CelluleEtatArbre;
import fr.jeu.model.cellule.patternEtat.CelluleEtatHerbe;
import fr.jeu.model.cellule.patternEtat.CelluleEtatTente;
import fr.jeu.model.cellule.patternEtat.CelluleEtatVoid;

/** 
 * <b>Classe représentant une celulle d'une grille.</b>
 * 
 * <p>
 * Une cellule est caractérisé par :
 * <ul>
 * <li>des coordonnées x et y faisant référence au placement de celle ci dans une grille (accès en lecture)</li>
 * <li>un état (accès en lecture et modifiable par les méthodes) (Design Pattern Etat)</li> 
 * </ul>
 * 
 * <p>
 * Il doit etre capable de :
 * <ul>
 * <li>se créer</li>
 * <li>placer une herbe</li>
 * <li>placer une tente</li>
 * <li>passer la case à vide (void)</li>
 * <li>placer un arbre</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class Cellule {
	
	private int x;
	
	private int y;
	
	private CelluleEtat etat;
	
	public Cellule(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	/**
	 * Getter de x.
	 * @return La coordonnée horizontale de la cellule. 
	 */
	public int getX() {
		return x;
	}

	/**
	 * Setter de x.
	 * @param x La valeur à mettre dans x.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Getter de y.
	 * @return La coordonnée verticale de la cellule. 
	 */
	public int getY() {
		return y;
	}

	/**
	 * Setter de y.
	 * @param y La valeur à mettre dans y.
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	public CelluleEtat getEtat()
	{
		return etat;
	}
	
	/**
	 * Méthode de changement à l'état {@link CelluleEtatHerbe CelluleEtatHerbe} de la cellule.
	 */
	public void placerHerbe()
	{
		etat = CelluleEtatHerbe.getEtat();
	}
	
	/**
	 * Méthode de changement à l'état {@link CelluleEtatTente CelluleEtatTente} de la cellule.
	 */
	public void placerTente()
	{
		etat = CelluleEtatTente.getEtat();
	}
	
	/**
	 * Méthode de changement à l'état {@link CelluleEtatVoid CelluleEtatVoid} de la cellule.
	 */
	public void placerVoid()
	{
		etat = CelluleEtatVoid.getEtat();
	}
	
	/**
	 * Méthode de changement à l'état {@link CelluleEtatVoid CelluleEtatVoid} de la cellule.
	 */
	public void placerArbre()
	{
		etat = CelluleEtatArbre.getEtat();
	}

	@Override
	public String toString() {
		return etat.toString();
	}
}
