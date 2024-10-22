public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    String getLastName() {
        return this.lastName;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getMiddleName() {
        return this.middleName;
    }

    Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    Name(String firstName) {
        this(null, firstName, null);
    }

    Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public String toString() {
        String s = "";
        if (this.lastName != null) {
            s += this.lastName;
        }
        if (this.firstName != null) {
            if (s != "") {
                s += " ";
            }
            s += this.firstName;
        }
        if (this.middleName != null) {
            if (s != "") {
                s += " ";
            }
            s += this.middleName;
        }
        return s;
    }
}


