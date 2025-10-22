package entities;

public class Penguin extends Animal_aqua{
    protected float sSpeed;
    public Penguin() {}

    public Penguin(String family, String name, int age, boolean isMammal,String habitat, float sSpeed) {
    super(family, name, age, isMammal, habitat);
    this.sSpeed = sSpeed;
    }
    public float getsSpeed() {
        return sSpeed;
    }
    public void setsSpeed(float sSpeed) {
        this.sSpeed = sSpeed;
    }
    @Override
    public String toString() {
        return super.toString()+" sSpeed=" + sSpeed;
    }
    @Override
    public void swim() {
        System.out.println("This penguin is swimming quickly under the ice!");
    }

}
