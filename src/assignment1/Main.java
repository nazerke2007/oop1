package assignment1;

public class Main {
    public static void main(String[] args) {
        // Create Shelter
        Shelter shelter = new Shelter("Happy Tails Shelter", "456 Pet Street");

        // Create Pets
        Pet pet1 = new Pet("Buddy", "Dog", 3);
        Pet pet2 = new Pet("Mittens", "Cat", 2);

        // Add Pets to Shelter
        shelter.addPet(pet1);
        shelter.addPet(pet2);

        // Display Pets in Shelter
        shelter.displayPets();

        // Create Adopters
        Adopter adopter1 = new Adopter("Alice", 30, "alice@gmail.com");
        Adopter adopter2 = new Adopter("Bob", 40, "bob@gmail.com");

        // Print Adopter Details
        System.out.println("\nAdopter Information:");
        System.out.println(adopter1);
        System.out.println(adopter2);

        // Compare Pets by Age
        System.out.println("\nComparing pets:");
        if (pet1.getAge() > pet2.getAge()) {
            System.out.println(pet1.getName() + " is older than " + pet2.getName() + ".");
        } else if (pet1.getAge() < pet2.getAge()) {
            System.out.println(pet2.getName() + " is older than " + pet1.getName() + ".");
        } else {
            System.out.println(pet1.getName() + " and " + pet2.getName() + " are the same age.");
        }
    }
}

