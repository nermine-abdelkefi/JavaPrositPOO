package entities;

public class Animal_terr extends Animal {
    protected int nbrLegs;
    public Animal_terr() {}
    public Animal_terr(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs() {
        return nbrLegs;
    }
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString()+" nbrLegs=" + nbrLegs ;
    }
}
