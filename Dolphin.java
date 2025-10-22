package entities;

public class Dolphin extends Animal_aqua{
    protected float sDepth;
    public Dolphin() {
        super();


    }
    public Dolphin(String family, String name, int age, boolean isMammal,String habitat, float sDepth) {
        super(family,name,age,isMammal, habitat);
        this.sDepth = sDepth;
    }
    public float getsDepth() {
        return sDepth;
    }
    public void setsDepth(float sDepth) {
        this.sDepth = sDepth;
    }
    @Override
    public String toString() {
        return super.toString()+" Sdepth=" + sDepth;
    }
    // redifinition de swim
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming");
    }

}
