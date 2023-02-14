package School;

public class Student {
    private String name;
    private int id_number;
    private static int nextID = 1;

    public Student(String name) {
        this.name = name;
        this.id_number = nextID;
        nextID++;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public boolean precedesById(Student student2Id) {
        return this.id_number < student2Id.id_number;
    }

    public String toString() {
        return "Student Name: " + name + "\n ID Number:  " + id_number;
    }
}