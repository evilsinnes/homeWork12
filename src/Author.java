import java.util.Objects;

public class Author {
    private String firstName;
    private String surnName;

    public Author(String firstName, String surnName) {
        this.firstName = firstName;
        this.surnName = surnName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurnName() {
        return this.surnName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurnName(String surnName) {
        this.surnName = surnName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(surnName, author.surnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surnName);
    }

    @Override
    public String toString() {
        return "Author{" +
                firstName  +
                ", " + surnName  +
                '}';
    }
}

