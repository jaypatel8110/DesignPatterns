package OverrideCoreObjectMethods;

import java.util.Objects;

public class MyEqualsMethod {
    private int id;
    private String firstName;
    private String lastName;

    public int getId() { return id; }
    public void setId(int id) { this.id = id;}

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public boolean equals(Object o) {
    if (this==o) return true;

    if (o==null || o.getClass()!=this.getClass()){
        return false;
    }

    MyEqualsMethod myEqualsMethod= (MyEqualsMethod) o;

    return id== myEqualsMethod.id &&
            ( firstName==myEqualsMethod.firstName ||
                    ( firstName!=null && firstName.equals(myEqualsMethod.getFirstName())) &&
             (lastName==myEqualsMethod.lastName || (lastName!=null && lastName.equals(myEqualsMethod.getLastName()))));

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}
