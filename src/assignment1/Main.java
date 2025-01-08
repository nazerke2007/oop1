package assignment1;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Happy Shelter", "456 Pet Street");

        Pet pet1 = new Pet("Buddy", "Dog", 3);
        Pet pet2 = new Pet("Mittens", "Cat", 2);
        Pet pet3 = new Pet("Max", "Dog", 1);

        shelter.addPet(pet1);
        shelter.addPet(pet2);
        shelter.addPet(pet3);

        System.out.println("Original Pet List:");
        shelter.displayPets();

        System.out.println("\nSorted Pets by Age:");
        shelter.sortPetsByAge();
        shelter.displayPets();

        System.out.println("\nFiltered Pets by Type (Dog):");
        for (Pet dog : shelter.filterPetsByType("Dog")) {
            System.out.println("  - " + dog);
        }

        Adopter adopter1 = new Adopter("Alice", 30, "alice@gmail.com");
        Adopter adopter2 = new Adopter("Bob", 40, "bob@gmail.com");

        System.out.println("\nAdopter Information:");
        System.out.println(adopter1);
        System.out.println(adopter2);
    }
}
