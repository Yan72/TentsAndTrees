package fr.jeu.view.patternObservateur;

/** 
 * <b>Interface définissant les comportements des objets observateurs (Design Pattern Observateur).</b>
 * 
 * <p>
 * On observateur est capable de :
 * <ul>
 * <li>s'actualiser</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public interface Observateur {
	
	/**
	 * Méthode d'actualisation de l'observateur mettant à jour l'interface.
	 */
	public void actualise();
}
 