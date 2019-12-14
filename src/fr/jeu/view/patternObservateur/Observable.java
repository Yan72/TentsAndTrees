package fr.jeu.view.patternObservateur;

/** 
 * <b>Interface définissant les comportements des objets observables (Design Pattern Observateur).</b>
 * 
 * <p>
 * Un observable est capable de :
 * <ul>
 * <li>ajouter un observateur</li>
 * <li>retirer un observateur</li>
 * <li>mettre à jour un observateur</li>
 * </ul>
 * 
 * @author Yann Paulmery
 * 
 */
public interface Observable {
	
	/**
	 * Méthode d'ajout d'un {@link Observateur Observateur}.
	 * @param o Observateur à ajouter.
	 */
	public void attacheObservateur(Observateur o);
	
	/**
	 * Methode de suppression d'un {@link Observateur Observateur}.
	 * @param o Observateur à supprimer.
	 */
	public void detacheObservateur(Observateur o);
	
	/**
	 * Méthode notifiant tous les {@link Observateur Observateur} et les forcant à s'actualiser.
	 */
	public void notifieObservateurs();
}
