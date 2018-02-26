/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Animal;

import java.util.ArrayList;

/**
 *
 * @author Youming Zheng
 */
public class AnimalDirectory {
    private ArrayList<Animal> animalDirectory;
    
    public AnimalDirectory(){
        animalDirectory=new ArrayList<Animal>();
    }

    public ArrayList<Animal> getAnimalDirectory() {
        return animalDirectory;
    }
    
    public Animal newAnimal(){
        Animal animal=new Animal();
        animalDirectory.add(animal);
        return animal;
    }
}
