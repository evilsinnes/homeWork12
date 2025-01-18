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


}

