package Lab_1_5;

public class Student {
    public String lastName;
    public String firstName;
    public int birthDay;
    public int birthMonth;
    public int birthYear;
    public String hobby;

    public Student(String lastName, String firstName, int birthDay, int birthMonth, int birthYear, String hobby) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return String.format("Прізвище: %-12s | Ім'я: %-10s | Дата народження: %02d.%02d.%4d | Хобі: %s",
                lastName, firstName, birthDay, birthMonth, birthYear, hobby);
    }
}