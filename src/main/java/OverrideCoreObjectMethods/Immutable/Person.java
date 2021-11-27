package OverrideCoreObjectMethods.Immutable;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String fistName;
    private final String lastName;
    private final ArrayList<String> addressList;

    public Person(String fistName, String lastName, ArrayList<String> addressList) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.addressList = addressList;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getAddressList() {
        return (ArrayList<String>) addressList.clone();
    }
}
