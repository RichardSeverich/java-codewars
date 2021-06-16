package codewars.com.richard;

import java.util.Objects;

/** */
class SoccerPlayer {

    private final String name;
    private final String lastName;

    public SoccerPlayer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true;}
        if (o == null || getClass() != o.getClass()) { return false;}
        SoccerPlayer that = (SoccerPlayer) o;
        return name.equals(that.name) && lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name + this.lastName);
    }
}
