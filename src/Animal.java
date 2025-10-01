public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    //constructer paramétré ta3  class Animal

    public Animal(String family , String name , int age ,boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
//affichage des attributs animal
    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }
}
