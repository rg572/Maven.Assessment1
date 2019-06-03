package com.zipcodewilmington.assessment1.part3;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name;
    private ArrayList<Pet> petList = new ArrayList<Pet>();
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if(pets != null){
            for(Pet pet : pets) {
                petList.add(pet);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        petList.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        petList.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return petList.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer min = Integer.MAX_VALUE;
        for(Pet pet : petList){
            if(pet.getAge() < min){
                min = pet.getAge();
            }
        }
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer max = Integer.MIN_VALUE;
        for(Pet pet : petList){
            if(pet.getAge() > max){
                max = pet.getAge();
            }
        }
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        if(petList.size() == 0){
            return null;
        }
        else{
            Float sum = 0F;
            for(Pet pet : petList){
                sum += pet.getAge();
            }
            return sum/petList.size();

        }
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petList.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if(petList.size()==0){
            return new Pet[1];
        }
        else {
            return petList.toArray(new Pet[petList.size()]);
        }
    }
}
