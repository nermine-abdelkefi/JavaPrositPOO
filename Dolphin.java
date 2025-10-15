package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed; // Instruction 20: Attribut spécifique

    // Instruction 20: Constructeur par défaut
    public Dolphin() {
    }

    // Instruction 22: Constructeur paramétré
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat); // Appel au constructeur de Aquatic
        this.swimmingSpeed = swimmingSpeed;
    }

    // Instruction 23: Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", Vitesse de nage=" + swimmingSpeed + " km/h";
    }

    // Instruction 24: Redéfinition de swim()
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}