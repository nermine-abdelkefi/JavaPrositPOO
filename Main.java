package Main;

import entities.*;

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


//21
        //heritage
        System.out.println("heritage");
        //Animal_aqua aqua = new Animal_aqua();
        Animal_terr terr=new Animal_terr();
        Dolphin dolphin=new Dolphin();
        Penguin penguin=new Penguin();
        //System.out.println(aqua);
        System.out.println(dolphin);
        System.out.println(penguin);
        System.out.println(terr);

//22
        System.out.println("avec protected");
        //Animal_aqua aqua2 = new Animal_aqua("abc","aqua",15,true,"mer")
        // System.out.println(aqua2);
        Animal_terr terr2=new Animal_terr("abcde","terr",4,true,4);
        System.out.println(terr2);
        Dolphin dolphin2=new Dolphin("dolph","dol",2,true,"mer",12);
        System.out.println(dolphin2);
        Penguin pung1=new Penguin("puing","pui",5,true,"mer",14);
        System.out.println(pung1);
//23
        System.out.println("instruction 23");
        //Animal_aqua aquatic = new Animal_aqua("FishFamily", "Nemo", 2, false, "Ocean");
        Animal_terr terrestrial = new Animal_terr("Feline", "Lion", 5, true, 4);
        Dolphin dolphin1 = new Dolphin("Cetacean", "Flipper", 8, true, "Sea", 25.6f);
        Penguin penguin1 = new Penguin("Bird", "Pingu", 4, false, "Antarctica", 10.5f);

        //System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin1);
        System.out.println(penguin1);
//24
        System.out.println("Swim");
        //aquatic.swim();
        dolphin1.swim();
        penguin1.swim();
//25

        //Animal_aqua aquatic2 = new Animal_aqua("chat", "reo", 2, false, "sea");
        //Animal_aqua aquatic3 = new Animal_aqua("requin", "r", 2, false, "mer");
        //Animal_aqua aquatic4 = new Animal_aqua("dauphin", "d", 2, false, "mer");
        //zoo.addAquaticAnimal(aquatic2);
        //zoo.addAquaticAnimal(aquatic3);
        //zoo.addAquaticAnimal(aquatic4);
        Zoo zoo1 = new Zoo("Zoo de Tunis", "Tunis");
        zoo1.addAquaticAnimal(dolphin1);
        zoo1.addAquaticAnimal(penguin1);
//26
        Zoo zooaqua = new Zoo("Friguia", "Hammamet");

        Dolphin dauphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Océan", 30.5f);
        Penguin pingouin = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctique", 12.2f);

        zooaqua.addAquaticAnimal(dauphin);
        zooaqua.addAquaticAnimal(pingouin);
        System.out.println("Appel de swim() pour tous les animaux aquatiques:");

        zooaqua.aquaSwim();
        //remarque que la class dauphin a connu la methode swim puisque elle est trouver dans sa class tendis que la class pingouin non
        //27
        System.out.println("Profondeur maximale des pingouins : " + zooaqua.maxPenguinSwimingDepth() + " mètres");
        //28
        zooaqua.displayNumberOfAquaticsByType();
        //31
        Animal_aqua p1 = new Penguin("Birds", "Pingo", 3, false, "Glace", 100);
        Animal_aqua p2 = new Penguin("Birds", "Pingo", 3, false, "Glace", 80);

        System.out.println(p1.equals(p2));









    }




    }