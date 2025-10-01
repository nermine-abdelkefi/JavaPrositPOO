public class Zoo {
    final int NBR_CAGES=25;
    Animal[] animals = new Animal[NBR_CAGES];
    String name;
    String city;
    int nbrCages;
    int nbrAnimals = 0;



    public Zoo( Animal animals, String name, String city,  int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

    }
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo: " + name + " Ville: " + city + " Nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;

    }

    public void afficheAnimals() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println(i +"="+ animals[i]);
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean addAnimal2(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                for (int j = 0; j < animals.length; j++) {
                    if (animals[j] != null && animals[j].name.equalsIgnoreCase(animal.name)) {
                        System.out.println(" L'animal " + animal.name + " existe déjà dans le zoo");
                        return false;
                    }
                }
                animals[i] = animal;
                System.out.println(animal.name + " ajouté au zoo");
                return true;
            }
        }
        System.out.println("Zoo plein (" + NBR_CAGES + " cages)");
        return false;
    }
    public void removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                for (int j = i; j < animals.length - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animals.length - 1] = null;
                System.out.println(animal.name + " a été supprimé du zoo.");
                return;
            }
        }
        System.out.println( animal.name + " n'existe pas dans le zoo.");
    }

    public void addAnimalfull(Animal a) {
        if (!isZooFull()) {
            animals[nbrAnimals] = a;
            nbrAnimals++;
        } else {
            System.out.println("Zoo plein, impossible d'ajouter l'animal");
        }
    }
    public boolean isZooFull() {
        return nbrAnimals >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z, Zoo z2) {
        if (z.nbrAnimals > z2.nbrAnimals) {
            return z;
        } else if (z2.nbrAnimals > z.nbrAnimals) {
            return z2;
        } else {
            return z;
        }
    }



}