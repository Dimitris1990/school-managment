package my_Item_classes;


public class Trainer {
    
    String firstName;
    String lastName;

    public Trainer() {
    }
    public Trainer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder("\b\b• Trainer:\n");
       
        x.append("First Name - ").append(firstName).append("\n");
        x.append("Last Name  - ").append(lastName).append("\n");
        x.append("\n");
        return x.toString();
    }
    
    
}

