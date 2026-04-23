package Lab_1_4;

public class Student {
    public String lastName;
    public String firstName;
    public int group;
    public String faculty;

    public Student(String lastName, String firstName, int group, String faculty) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.faculty = faculty;
    }

    @Override
    public String toString() {

        return String.format("Група: %-4d | Прізвище: %-12s | Ім'я: %-10s | Факультет: %s",
                group, lastName, firstName, faculty);
    }
}