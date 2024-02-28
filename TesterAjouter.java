import static org.junit.jupiter.api.Assertions.*;

class TesterAjouter {

    @org.junit.jupiter.api.Test
    void fonctionne() {
        Composant comp = new Composant("gpu", "Asus", "RTX 4060", 460);
        Configuration conf = new Configuration("Build vide", 1000, new Composant[]{});
        conf.ajouter(comp);
    }
    @org.junit.jupiter.api.Test
    void memeCategorie() {
        Composant comp = new Composant("gpu", "Asus", "RTX 4060", 460);
        Composant core13600k = new Composant("CPU", "Intel", "Core i5-13600K", 330);
        Composant asusB760 = new Composant("Carte mère", "Asus", "ROG Strix B760", 200);
        Composant tridentzDDR5 = new Composant("Ram", "GSkill", "Trident-Z DDR5 16GB", 90);
        Composant asusRTX4060 = new Composant("gpu", "Asus", "RTX 4060", 460);
        Configuration conf = new Configuration("Build Intel Gen13", 1250, new Composant[]{core13600k, asusB760, tridentzDDR5, asusRTX4060});
        conf.ajouter(comp);
    }
    @org.junit.jupiter.api.Test
    void prixTropHaut() {
        Composant comp = new Composant("gpu", "Asus", "RTX 4060", 460);
        Configuration conf = new Configuration("Build vide", 0, new Composant[]{});
        conf.ajouter(comp);
    }
    @org.junit.jupiter.api.Test
    void tropComposants(){
        Composant comp = new Composant("gpu", "Asus", "RTX 4060", 460);
        Composant tridentzDDR5 = new Composant("Ram", "GSkill", "Trident-Z DDR5 16GB", 90);
        Configuration conf = new Configuration("Build Intel Gen13", 1250, new Composant[]{ tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5, tridentzDDR5});
        conf.ajouter(comp);
    }
}