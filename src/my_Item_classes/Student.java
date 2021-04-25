package my_Item_classes;

import java.time.LocalDate;



public class Student {
    
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    int tuitionFees;

    public Student() {
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth, int tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder("\b\b• Student:\n");

        x.append("First Name    - ").append(firstName).append("\n");
        x.append("Last Name     - ").append(lastName).append("\n");
        x.append("Date of birth - ").append(dateOfBirth).append("\n");
        x.append("Tuition fees  - ").append(tuitionFees).append("\n");
        x.append("\n");
        
        return x.toString();
    }
    
}
