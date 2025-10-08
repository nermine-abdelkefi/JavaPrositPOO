package Main;

import entities.Animal;
import entities.Zoo;

public class Main {
    public static void main(String[] args) {
// Création d'un animal
//        Animal lion = new Animal();
//        lion.family = "kkk";
//        lion.name = "Lion";
//        lion.age = 5;
//        lion.isMammal = true;
//
//        // Création d’un zoo
//        Zoo myZoo = new Zoo();
//        myZoo.name = "MyZoo";
//        myZoo.city = "Tunis";
//        myZoo.nbrCages = 20;

        Animal a=new Animal("hhh","lion",2,true);
        System.out.println(a.getName());
        Zoo z=new Zoo(a,"myzoo","tunis",5);

        System.out.println("Animal: " + a.getName() + ", Famille: " + a.getFamily());
        System.out.println("Zoo: " + z.getName() + " situé à " + z.getCity());

        Animal a1=new Animal("jjj","chat",8,true);
        Animal a2=new Animal("oo","chien",2,true);
        System.out.println("Animal: " + a1.getName() + ", Famille: " + a1.getFamily());
        System.out.println("Animal: " + a2.getName() + ", Famille: " + a2.getFamily());

        Zoo z2=new Zoo(a,"myzoo2","tunis",50);
        z2.displayZoo();


        System.out.println(z);
        System.out.println(z2);

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("add");
        System.out.println(z2.addAnimal(a1));
        System.out.println(z2.addAnimal(a2));
        System.out.println(z2.addAnimal(a1));
        System.out.println(z2.addAnimal(a2));
        System.out.println(z2.addAnimal(a1));
        System.out.println(z2.addAnimal(a2));

        System.out.println("Animaux dans le zoo :");
        z2.afficheAnimals();
        System.out.println("recherche");
        System.out.println("Recherche animal : " + z2.searchAnimal(a2));

        Animal a22=new Animal("oo","chien",2,true);
        System.out.println("Recherche de animal identique : " + z2.searchAnimal(a22));

        System.out.println("add version 2");
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal lion2 = new Animal("Felidae", "Lion", 5, true);
        Zoo zoo=new Zoo(lion,"zoo","tunis",8);

        zoo.addAnimal2(lion);
        zoo.addAnimal2(lion2);

        for (int i = 0; i < 30; i++) {
            zoo.addAnimal2(new Animal("Test", "Animal"+i, i, true));
        }

        System.out.println("remove animal");
        zoo.removeAnimal(lion);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, false);
        zoo.removeAnimal(elephant);

        System.out.println("add avec final");
        Zoo zoo2 = new Zoo("Zoo de Tunis", "Tunis");

        for (int i = 1; i <= 30; i++) {
            zoo2.addAnimal2(new Animal("Test", "Animal" + i, i, true));
        }

        System.out.println("zoo full");
        Zoo zf = new Zoo("Belvedere", "Tunis", 2);

        System.out.println(zf.isZooFull());
        zf.addAnimalfull(new Animal("Lion", "Carnivore", 5, true));
        zf.addAnimalfull(new Animal("Ours", "Omnivore", 7, true));
        zf.addAnimalfull(new Animal("Girafe", "Herbivore", 4, true));
        zf.addAnimalfull(new Animal("Lion", "Carnivore", 5, true));

        System.out.println(zf.isZooFull());
        System.out.println("compare");
        Zoo plusGrand = Zoo.comparerZoo(z,z2);

        System.out.println("Le zoo avec le plus d'animaux est : " + plusGrand.getName());
//instruction 17
        Zoo zff = new Zoo("Belvedere", "Tunis", 2);

        Animal lion5 = new Animal("Felidae", "Lion", 5, true);
        Animal ours = new Animal("Ursidae", "Ours", 7, true);
        Animal girafe = new Animal("Giraffidae", "Girafe", 4, true);

        zff.addAnimalen(lion5);
        zff.addAnimalen(ours);
        zff.addAnimalen(girafe);
        //18
        Animal tortue = new Animal("Testudines", "Toto", -3, false);
        System.out.println(" âge négatif " + tortue);
        Zoo zoo5 = new Zoo("", "Tunis", 5);

        System.out.println("nom vide du zoo" + zoo5.getName());




    }




    }