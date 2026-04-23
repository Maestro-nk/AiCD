package Lab_1_3;

public class Student {
    public String lastName;
    public String firstName;
    public int course;
    public long ticketNumber;
    public boolean servedInArmy;

    public Student(String lastName, String firstName, int course, long ticketNumber, boolean servedInArmy) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.course = course;
        this.ticketNumber = ticketNumber;
        this.servedInArmy = servedInArmy;
    }

    @Override
    public String toString() {

        return String.format("| %-15s | %-10s | %-4d | %-10d | %-14s |",
                lastName, firstName, course, ticketNumber, (servedInArmy ? "Так" : "Ні"));
    }
}