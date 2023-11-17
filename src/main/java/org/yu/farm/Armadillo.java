package org.yu.farm;


import org.yu.farm.scary.ScaryAnimal;

public class Armadillo extends ScaryAnimal {

    public Armadillo(String name) {
        super(AnimalType.ARMADILLO, name);
    }


    @Override
    public void makeNoise() {
        System.out.println("shhh.  armadillos are silent...");
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("Armadillo is eating");
    }
}
