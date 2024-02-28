public class Composant {
    private final String categorie;
    private String marque, nom;
    private double prix, rabais;
    public Composant(String categorie, String marque, String nom, double prix) {
        this.categorie = categorie.toUpperCase();
        this.marque = marque;
        this.nom = nom;
        this.prix = prix;
    }
    public Composant copier(){
        Composant nouveau = new Composant(categorie, marque, nom, prix);
        return nouveau;
    }
    public boolean estIdentique(Composant autre){
        if(autre.getCategorie().equals(categorie) && autre.getMarque().equals(marque) && autre.getNom().equals(nom) ){
            return true;
        }
        else {
            return false;
        }
    }
    public String getCategorie(){
        return this.categorie;
    }
    public String getMarque(){
        return this.marque;
    }
    public String getNom(){
        return this.nom;
    }
    public double getPrix(){
        return this.prix - (this.prix * this.rabais);
    }
    public double getRabais(){
        return this.rabais;
    }
    public String toString(){
        return "[" + this.categorie + "] " + this.marque + " " + this.nom;
    }
    public void setPrix(double prix){
        this.prix = prix;
    }
    public void setRabais(double rabais){
        this.rabais = rabais;
    }
}
