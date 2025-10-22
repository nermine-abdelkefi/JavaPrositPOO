package entities;

public abstract class  Animal_aqua extends Animal{
     protected String habitat;
     public Animal_aqua() {}
     public Animal_aqua(String family, String name, int age, boolean isMammal, String habitat) {
         super(family, name, age, isMammal);
         this.habitat = habitat;
     }

     public  String getHabitat() {
         return habitat;
     }
     public void setHabitat(String habitat) {
         this.habitat = habitat;
     }
    @Override
    public String toString() {
        return super.toString()+ "habitat=" + habitat ;
    }
    //methode swim
    public abstract void swim();
     //redefenir equals()
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Animal_aqua animal_aqua = (Animal_aqua) o;
        return this.getName().equals(animal_aqua.getName()) &&
                this.getAge() == animal_aqua.getAge() &&
                this.getHabitat().equals(animal_aqua.getHabitat());
    }
}
