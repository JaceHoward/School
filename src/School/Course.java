package School;

public class Course {
    private String department;
    private int courseNumber;
    private int creditHours;

    public Course(String department, int courseNumber, int creditHours) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
    }

    public String toString() {
        return department + "-" + courseNumber + " is " + creditHours + " credit hours.";
    }
}
