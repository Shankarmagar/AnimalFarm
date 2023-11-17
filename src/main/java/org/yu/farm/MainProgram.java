package org.yu.farm;

import org.yu.farm.scary.Jaguar;
import org.yu.farm.scary.ScaryAnimal;
import org.yu.farm.scary.ScaryCat;

import java.util.List;

/*
 * LET'S TAKE A TRIP TO A FARM AND MEET SOME ANIMALS!
 *
 */

public class MainProgram {
    public static void main(String[] args) {
        AnimalFarm myFarm = new AnimalFarm();


        List<Animal> animalList = myFarm.getAnimals();


        // Let's meet each of the animals!

        for (Animal a : animalList) {

            System.out.println("Person: Oooh!  An animal!  Tell me about yourself!");
            System.out.printf("Animal: Hello, I'm %s the %s \n", a.getName(), a.getSpecies());

            // add a POLYMORPHIC call to makeNoise();
            a.makeNoise();
            // add a POLYMORPHIC call to eatUnderYonderTree();
            a.eatUnderYonderTree();

            if ( a instanceof Armadillo) {
                System.out.println("EEEEEK. AN ARMADILLO!");

                System.out.println("");
            }
            // I did this because Jaguar is extending Cat which is sub-class of Animal not Scary Animals
            if(a instanceof ScaryAnimal||a instanceof Jaguar || a instanceof ScaryCat)
            {
                System.out.println("Eeeeeeek! a scary animal");
            }
            System.out.println("");

        }

    }
}
