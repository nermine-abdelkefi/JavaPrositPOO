package tn.esprit.gestionzoo.entities;
//prosit 5
//instruction20
public class Aquatic extends Animal {
    protected String habitat;

    //ins 20 constructeur par defaut
    public Aquatic() {
    }

    //ins 22 constructeur parametreee
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    //ins23 tostring
    @Override
    public String toString() {
        return super.toString() + "habitat=" + habitat;
    }
    //ins24 method swim()
    public void swim(){
        System.out.println( "aquatic a animal is swiming");
    }

}
