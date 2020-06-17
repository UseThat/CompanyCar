package pl.companycar.model;

public class Employee {
    private String firstName;
    private String lastName;
    private String documentId;
    private int level;

    public Employee(String firstName, String lastName, String documentId, int level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentId = documentId;
        this.level = level;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return firstName + ";"+lastName + ";"+documentId + ";"+level;
    }
}
