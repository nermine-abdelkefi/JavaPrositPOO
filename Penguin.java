package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth; // Instruction 20: Attribut spécifique

    // Instruction 20: Constructeur par défaut
    public Penguin() {
    }

    // Instruction 22: Constructeur paramétré
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat); // Appel au constructeur de Aquatic
        this.swimmingDepth = swimmingDepth;
    }

    // Instruction 23: Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", Profondeur de nage=" + swimmingDepth + " mètres";
    }

    // Instruction 24: La méthode swim() est héritée de Aquatic et affiche "This aquatic animal is swimming."
}

