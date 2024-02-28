public class Configuration {
    private final String description;
    private double prixMax;
    private Composant composants[];
    private int nbComposants;
    private final int MAX_COMPOSANTS = 20;
    public Configuration(String description, double prixMax, Composant[] composants){
        this.description = description.toUpperCase();
        this.prixMax = prixMax;
        this.composants = composants;
    }
    public Configuration(Configuration originale){
        this.description = originale.getDescription();
        this.prixMax = originale.getPrixMax();
        this.composants = originale.getComposants();
    }
    public double calculerTotal(double taxe){
        double prixTotal = 0;
        for(int i = 0; i < composants.length; i++){
            prixTotal += composants[i].getPrix();
        }
        prixTotal += prixTotal * taxe;
        return prixTotal;
    }
    public Composant rechercher(String categorie){
        for (int i = 0; i < composants.length; i++) {
            if(composants[i].getCategorie() == categorie){
                return composants[i];
            }
        }
        return null;
    }
    public boolean ajouter(Composant composant){
        double prixTotal = 0;
        for (int i = 0; i < composants.length; i++) {
            prixTotal += composants[i].getPrix();
            if (composants[i].getCategorie() == composant.getCategorie()) {
                return false;
            }
        }
        if(composants.length >= MAX_COMPOSANTS || prixTotal >= prixMax){
            return false;
        }
        Composant[] nouveauTab = new Composant[composants.length + 1];
        for (int i = 0; i < composants.length; i++) {
            nouveauTab[i] = composants[i];
        }
        nouveauTab[composants.length] = composant;
        composants = nouveauTab;
        return true;
    }
    public boolean retirer(Composant composant){
        for (int i = 0; i < composants.length; i++) {
            if (composants[i] == composant) {
                Composant[] nouveauTab = new Composant[composants.length - 1];
                for (int j = 0; j < composants.length - 1; j++) {
                    nouveauTab[j] = composants[j];
                }
                composants = nouveauTab;
                return true;
            }
        }
        return false;
    }
    public boolean remplacer(Composant composant){
        for (int i = 0; i < composants.length; i++) {
            if (composants[i].getCategorie() == composant.getCategorie()) {
                composants[i] = composant;
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return description + " (" + prixMax + ") :\n" + i + composants[i].getNom() + "(" + composants[i].getPrix() + ")";
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrixMax(){
        return this.prixMax;
    }
    public Composant[] getComposants(){
        return this.composants;
    }
    public int getNbComposants(){
        return this.nbComposants;
    }
    public int getMAX_COMPOSANTS(){
        return this.MAX_COMPOSANTS;
    }
}
