package ClassWork;

public class Pet {
    private static int nextPet = 0;
    public String name;
    private String type;
    private int pets;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
        this.pets = 0;
        Pet.nextPet++;
    }

    public static int getNumberOfPets() {
        return Pet.nextPet;
    }

    public void petThePet() {
        pets++;
    }

    public String toString() {
        return "The " + type + " named " + name + " has been petted " + pets + " times.";

    }
}
