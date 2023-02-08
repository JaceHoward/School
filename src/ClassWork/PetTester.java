package ClassWork;

public class PetTester {
    public static void main(String[] args) {
        Pet cat = new Pet("Bill", "Cat");
        System.out.println(cat);
        Pet dog = new Pet("Rufus", "dog");
        System.out.println("The number of pets is " + Pet.getNumberOfPets());
    }
}
