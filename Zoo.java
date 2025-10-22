package entities;
public class Zoo {
    private final int NBR_CAGES=25;
    private Animal[] animals = new Animal[NBR_CAGES];
    private String name;
    private String city;
    private int nbrCages;
    int nbrAnimals = 0;
    Animal_aqua[] animal_aquas = new Animal_aqua[10];

    //ajouter aquatic instruction 25
    public void addAquaticAnimal(Animal_aqua aquatic) {
        for (int i = 0; i < animal_aquas.length; i++) {
            if (animal_aquas[i] == null) {
                animal_aquas[i] = aquatic;
                System.out.println(aquatic.getName() + "est ajouter avec succée au zoo");
                return;
            }

        }
        System.out.println(" le zoo est plein impossible d'ajouter ");
    }
    //instruction 27
    public float maxPenguinSwimingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < animal_aquas.length; i++) {
            if (animal_aquas[i] != null && animal_aquas[i] instanceof Penguin) {
                Penguin p = (Penguin) animal_aquas[i];
                if (p.getsSpeed() > maxDepth) {
                    maxDepth = p.getsSpeed();
                }
            }
        }
        return maxDepth;
    }
    //instruction 28
    public void displayNumberOfAquaticsByType(){
        int nbDolph=0;
        int nbPenguin=0;
        for(int i=0;i< animal_aquas.length;i++){
            if(animal_aquas[i] != null){
                nbDolph++;
            } else if (animal_aquas[i] instanceof Dolphin ) {
                nbPenguin++;

            }
        }
        System.out.println("Nombre de dauphins: " + nbDolph);
        System.out.println("Nombre de penguins: " + nbPenguin);
    }
//swim aqua
    public void aquaSwim(){
        for (int i = 0; i < animal_aquas.length; i++) {
            if (animal_aquas[i] != null) {
                animal_aquas[i].swim();
            }
        }
    }
    public Zoo(Animal animals, String name, String city, int nbrCages) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "ZooSansNom";
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.trim().isEmpty()) {
            this.city = city;
        } else {
            this.city = "VilleInconnue";
        }
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        if (nbrCages > 0) {
            this.nbrCages = nbrCages;
        } else {
            this.nbrCages = NBR_CAGES;
        }
    }
    public int getNbrAnimals() {
        return nbrAnimals;
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
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public boolean addAnimal2(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                for (int j = 0; j < animals.length; j++) {
                    if (animals[j] != null && animals[j].getName().equalsIgnoreCase(animal.getName())) {
                        System.out.println(" L'animal " + animal.getName() + " existe déjà dans le zoo");
                        return false;
                    }
                }
                animals[i] = animal;
                System.out.println(animal.getName() + " ajouté au zoo");
                return true;
            }
        }
        System.out.println("Zoo plein (" + NBR_CAGES + " cages)");
        return false;
    }
    public void removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getName().equals(animal.getName())) {
                for (int j = i; j < animals.length - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animals.length - 1] = null;
                System.out.println(animal.getName() + " a été supprimé du zoo.");
                return;
            }
        }
        System.out.println( animal.getName() + " n'existe pas dans le zoo.");
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
    public boolean addAnimalen(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo plein (" + nbrCages + " cages), impossible d'ajouter " + animal.getName());
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.getName() + " ajouté au zoo " + name);
        return true;
    }

}
