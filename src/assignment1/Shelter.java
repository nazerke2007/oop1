package assignment1;

import java.util.ArrayList;

public class Shelter {
    private String name;
    private String location;
    private ArrayList<Pet> pets;

    public Shelter(String name, String location) {
        this.name = name;
        this.location = location;
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void displayPets() {
        System.out.println("Pets available at " + name + " located at " + location + ":");
        for (Pet pet : pets) {
            System.out.println("  - " + pet);
        }
    }
}

