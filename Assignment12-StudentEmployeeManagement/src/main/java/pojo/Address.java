package pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private int houseNumber;
    private String street;

    public Address() {
    }

    public Address(int houseNumber, String street) {
        this.houseNumber = houseNumber;
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                '}';
    }
}
