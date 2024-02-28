public class Configuration {
    private final String description;
    private double prixMax;
    private Composant composants = new Composant[()];
    private int nbComposants;
    private final int MAX_COMPOSANTS = 20;
    public Configuration(String description, double prixMax, Composant[] composants){
        this.description = description.toUpperCase();
        this.prixMax = prixMax;
        this.composants[] = composants[];
    }
    public Configuration(Configuration originale){
        this.description = originale.getDescription();
        this.prixMax = originale.getPrixMax();
        this.composants[] = originale.getComposants();
    }
    public double calculerTotal(double taxe){
        double prixTotal = 0;
        for(int i = 0; i < composants[].length; i++){
            prixTotal += composants[i].getPrix();
        }
        prixTotal += prixTotal * taxe;
        return prixTotal;
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
