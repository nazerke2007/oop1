package assignment1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Shelter {
    private String name;
    private String location;
    private List<Pet> pets;

    public Shelter(String name, String location) {
        this.name = name;
        this.location = location;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> filterPetsByType(String type) {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets) {
            if (pet.getType().equalsIgnoreCase(type)) {
                result.add(pet);
            }
        }
        return result;
    }

    public List<Pet> sortPetsByAge() {
        pets.sort(Comparator.comparingInt(Pet::getAge));
        return pets;
    }

    public void displayPets() {
        System.out.println("Pets available at " + name + " located at " + location + ":");
        for (Pet pet : pets) {
            System.out.println("  - " + pet);
        }
    }
}
