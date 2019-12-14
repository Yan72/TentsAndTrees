package fr.jeu.model.grille;

import java.io.*;
import java.util.Arrays;

import fr.jeu.model.cellule.Cellule;
import fr.jeu.model.indicateurs.TableauIndicateurs;

/** 
 * <b>Classe représentant la grille de jeu.</b>
 * 
 * <p>
 * Une grille est caractérisé par :
 * <ul>
 * <li>une matrice de cellule pemettant le jeu (accès en lecture et écriture)</li>
 * <li>une matrice contenant la solution de la grille étudiée (accès en lecture et écriture)</li>
 * <li>deux tableaux représentants les nombres indiqués en tête de ligne ou de colonne (nombre de tente à placer sur cette ligne ou colonne)</li>  
 * </ul>
 * 
 * <p>
 * Il doit etre capable de :
 * <ul>
 * <li>se créer de 2 manières différentes :
 * <ul>
 * <li>en ne connaissant que la difficulté</li>
 * <li>en connaissant aussi le numéro de la ligne à regarder dans le fichier</li>
 * </ul></li>
 * <li>s'initialiser</li>
 * <li>s'afficher</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public class Grille {
	
	/**
	 * Grille jouable par le joueur.
	 * 
	 * <p>
	 * Tableau de {@link Cellule Cellule} modifiable par le joueur.
	 * 
	 * @see Cellule
	 * 
	 * @see Grille#getJouable()
	 * @see Grille#setJouable(Cellule[][])
	 */
	private Cellule[][] jouable;
	
	/**
	 * Grille de solution.
	 * 
	 * <p>
	 * Tableau de {@link Cellule Cellule} non modifiable par le joueur.
	 * 
	 * @see Cellule
	 * @see Grille#getSolution()
	 * @see Grille#setSolution(Cellule[][])
	 */
	private Cellule[][] solution;
	
	/**
	 * Tableau de nombre de tentes par colonnes.
	 * 
	 * <p>
	 * Représente les nombres de tentes sur chaque colonnes
	 * 
	 * @see TableauIndicateurs
	 */
	private TableauIndicateurs nbTentesColonnes;
	
	/**
	 * Tableau de nombre de tentes par ligne.
	 */
	private TableauIndicateurs nbTentesLignes;
	
	/**
	 * Taille de la grille.
	 * 
	 * <p>
	 * La grille est carrée, donc seule une seule dimension n'est utile.
	 * 
	 * @see Grille#getTaille()
	 * @see Grille#setTaille(int)
	 */
	private int taille;
	
	/**
	 * Constructeur de {@link Grille Grille} avec une difficulté et un numéro de grille.
	 * Initilise une grille donnée par sa difficulté et par son numéro.
	 * @param difficulte Difficulté de la grille cherchée.
	 * @param num Numéro de la grille voulue.
	 */
 	public Grille(String difficulte, int num)
	{
		this.initialisationGrille(difficulte, num);
	}

	/**
	 * Getter de jouable.
	 * @return Grille jouable.
	 * 
	 * @see Grille#jouable
	 */
	public Cellule[][] getJouable() {
		return jouable;
	}

	/**
	 * Setter de jouable.
	 * @param jouable L'instance à mettre dans jouable.
	 * 
	 * @see Grille#jouable
	 */
	public void setJouable(Cellule[][] jouable) {
		this.jouable = jouable;
	}

	/**
	 * Getter de solution.
	 * @return Grille solution.
	 * 
	 * @see Grille#solution
	 */
	public Cellule[][] getSolution() {
		return solution;
	}

	/**
	 * Setter de solution.
	 * @param solution L'instance à mettre dans solution.
	 * 
	 * @see Grille#solution
	 */
	public void setSolution(Cellule[][] solution) {
		this.solution = solution;
	}
	
	/**
	 * Getter de taille.
	 * @return La taille des grilles.
	 * 
	 * @see Grille#taille
	 */
	public int getTaille() {
		return taille;
	}
	
	/**
	 * Setter de taille.
	 * @param taille L'instance à mettre dans taille.
	 * 
	 * @see Grille#taille
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}

	/**
	 * Méthode d'initialisation des grilles en sachant la difficulté et la ligne de la grille.
	 * Cette méthode utilise des classes de java.io pour parcourir un fichier et trouver dedans une grille de solution.
	 * Après plusieurs fragmentations de la chaine de caractère obtenue, on obtient un tableau que nous traduirons en deux matrice de {@link Cellule Cellule}.
	 * L'une sera la solution et l'autre sera la grille jouable obtenue en effectuant un traitement différent selon la case rencontrée.
	 * @param difficulte Difficulté de la grille à selectionner, détermine le fichier dans lequel on va chercher.
	 * @param ligne Ligne du fichier à lire pour trouver la grille.
	 * 
	 * @see Cellule
	 * @see Grille#jouable
	 * @see Grille#solution
	 * @see Grille#nbTentesColonnes
	 * @see Grille#nbTentesLignes
	 */
	public void initialisationGrille(String difficulte, int ligne)
	{
		taille = 0;
		
		File fichier = new File("./Ressources/Grilles" + difficulte + "s.txt");
		FileInputStream fis;
	    BufferedReader dis;
	    
	    try {
	        //Création des objets
	        fis = new FileInputStream(fichier);
	        dis = new BufferedReader(new InputStreamReader(fis));
	        String c = "";
	        	        
	        //Lecture des lignes une par une à la recherche de celle voulue
	        for(int i = 1; i <= ligne; i++) {
	        	c = dis.readLine();
	        }
	        
	        //Une fois trouvée on la "split" dans un tableau de chaines
	        String[] tab = c.split(";");
	        
	        jouable = new Cellule[tab.length - 3][tab.length - 3];
			solution = new Cellule[tab.length - 3][tab.length - 3];
	        nbTentesColonnes = new TableauIndicateurs(tab.length - 3);
			nbTentesLignes = new TableauIndicateurs(tab.length - 3);
			
	        //On parcours ce tableau pour afficher les lignes de la grille les unes en dessous des autres, on fait en même temps le remplissage du tableau de nombres des lignes et des colonnes
	        for (int i = 0; i < tab.length; i++)
	        {
	        	if (i < 2)
	        		taille = Integer.parseInt(tab[i]);
	        	else if (i < tab.length - 1)
	        	{
	        		nbTentesLignes.setValTab(i-2, Character.getNumericValue(tab[i].charAt(taille+1)));
	        		nbTentesColonnes.setValTab(i-2, Character.getNumericValue(tab[tab.length-1].charAt(i-2)));
	        		
	        		for (int j = 0; j < taille; j++)
	        		{
//	        			System.out.println(tab[i].charAt(j));
	        			jouable[i-2][j] = new Cellule(i-2, j);
    					solution[i-2][j] = new Cellule(i-2, j);
	        			switch (tab[i].charAt(j))
	        			{
	        				case '_':
//	        					System.out.println(i -2);
//	        					System.out.println(j);
//	        					System.out.println("\n");
	        					jouable[i-2][j].placerVoid();
	        					solution[i-2][j].placerHerbe();
	        					break;
	        					
	        				case 'T':
//	        					System.out.println(i -2);
//	        					System.out.println(j);
//	        					System.out.println("\n");
	        					jouable[i-2][j].placerVoid();
	        					solution[i-2][j].placerTente();
	        					break;
	        				
	        				case 'A':
//	        					System.out.println(i -2);
//	        					System.out.println(j);
//	        					System.out.println("\n");
	        					jouable[i-2][j].placerArbre();
	        					solution[i-2][j].placerArbre();
	        					break;
	        			}
	        		}
	        	}
	        }	  			
	      } catch (FileNotFoundException e) {
	    	  e.printStackTrace();
	      } catch (IOException e) {
	    	  e.printStackTrace();
	      } catch (NumberFormatException e) {
	    	  e.printStackTrace();
	      } catch (IndexOutOfBoundsException e) {
	    	  e.printStackTrace();
	      } catch (NullPointerException e) {
	    	  e.printStackTrace();
	      }
		
	}
	
	@Override
	public String toString() {
		String s = "nbTentesColonnes=" + Arrays.toString(nbTentesColonnes.getTab()) + ", nbTentesLignes=" + Arrays.toString(nbTentesLignes.getTab()) + "\n";
		
		s = s + "\n Jouable : \n  " + " | " ;
		for (int i = 0; i < taille; i++) {
			s = s + nbTentesColonnes.getValTab(i) + " | " ;
		}
		s = s + "\n";
		
		for (int j = 0; j < taille * 2 + 2; j++)
			s = s + "--";
		s = s + "\n";
		
		for (int i = 0; i < taille; i++) {
			s = s + " " + nbTentesLignes.getValTab(i) + " | ";
			for (int j = 0; j < taille; j++) {
				s = s + jouable[i][j] + " | ";
			}
			s = s + "\n";
			for (int j = 0; j < taille * 2 + 2; j++)
				s = s + "--";
			s = s + "\n";
		}
		/*
		s = s + "\n Solution : \n ";
		for (int i = 0; i < taille; i++) {
			s = s + nbTentesColonnes[i];
		}
		s = s + "\n";
		for (int i = 0; i < taille; i++) {
			s = s + nbTentesLignes[i];
			for (int j = 0; j < taille; j++) {
				s = s + solution[i][j];
			}
			s = s + "\n";
		}*/
		return s;
	}
}
