package tn.esprit.gestionzoo.main;

import java.util.Scanner;
// Imports pour les classes d'entités
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class ZooManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instruction 2 : Saisie du Zoo
        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);
        sc.nextLine(); // Consommer le newline

        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        //Prosit 2
        // CORRECTION : Utilisation du constructeur
        Animal lion = new Animal("Félidé", "Lion", 5, true);

        Zoo myZoo = new Zoo();
        // CORRECTION : Utilisation des Setters pour les attributs de Zoo (sont privés)
        myZoo.setName("Parc Animalier");
        myZoo.setCity("Tunis");

        // CORRECTION : Utilisation des Getters pour Animal
        System.out.println("Animal : " + lion.getName() + " (" + lion.getFamily() + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true); // lion1 est conservé pour les tests

        System.out.println("Animal créé : " + lion1.getName());

        myZoo.displayZoo();
        System.out.println(myZoo);

        //Prosit 3
        Zoo zoo1 = new Zoo("Zoo Esprit", "Tunis", 5); // Taille 5 pour tester le Zoo plein
        Zoo zoo2 = new Zoo("Zoo Safari", "Sousse", 3);

        Animal tigre = new Animal("Félidé", "Shere Khan", 7, true);
        Animal lion2 = new Animal("Félidé", "Lion", 5, true); // Doublon (même nom que 'lion')

        // Test Ajout
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(lion2); // doit être refusé (doublon)

        // Test Affichage
        zoo1.displayAnimals();

        // Test Recherche
        System.out.println("Indice du lion : " + zoo1.searchAnimal(lion));

        // Test Suppression
        zoo1.removeAnimal(tigre);
        zoo1.displayAnimals();

        // Test Zoo plein
        for (int i = 0; i < 30; i++) {
            if (!zoo1.isZooFull()) {
                zoo1.addAnimal(new Animal("TestFamily", "AnimalUnique" + i, 2, false));
            }
        }
        System.out.println("Zoo plein : " + zoo1.isZooFull());

        // Test Comparaison
        zoo2.addAnimal(new Animal("Canidés", "Wolf", 4, true));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Zoo avec le plus d'animaux : " + (plusGrand != null ? plusGrand.getName() : "Aucun, ils sont identiques"));

        // --- Début des Tests Prosit 5 ---

        // Instruction 21 & 22: Instanciation des classes avec constructeurs paramétrés
        Aquatic poisson = new Aquatic("Poissons", "Nemo", 1, false, "Mer");
        Terrestrial elephant = new Terrestrial("Éléphantidés", "Dumbo", 10, true, 4);
        Dolphin flipper = new Dolphin("Delphinidés", "Flipper", 8, true, "Océan Pacifique", 45.5f);
        Penguin happyFeet = new Penguin("Spheniscidés", "Happy Feet", 3, false, "Banquise", 100.0f);

        System.out.println("\n--- Tests Prosit 5 (Hiérarchie) ---");

        // Instruction 23: Affichage avec toString() redéfini
        System.out.println("\nAffichage des animaux Prosit 5 :");
        System.out.println("1. Poisson (Aquatic) : " + poisson);
        System.out.println("2. Éléphant (Terrestrial) : " + elephant);
        System.out.println("3. Dauphin (Dolphin) : " + flipper);
        System.out.println("4. Pingouin (Penguin) : " + happyFeet);

        // Instruction 24: Comportement de nage (polymorphisme)
        System.out.println("\nTests de la méthode swim() :");
        poisson.swim();
        flipper.swim();
        happyFeet.swim();


    }
}