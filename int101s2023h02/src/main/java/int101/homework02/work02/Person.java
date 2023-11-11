package int101.homework02.work02;

import java.util.Objects;

public class Person {
    private static int nextId = 1;
    private final int id;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = nextId;
        nextId++;
    }

    public static void main(String[] args) {

    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() { return lastname; }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{ id = ");
        sb.append(getId());
        sb.append(", firstname = ");
        sb.append(getFirstname());
        sb.append(", lastname = ");
        sb.append(getLastname());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname);
    }
}
