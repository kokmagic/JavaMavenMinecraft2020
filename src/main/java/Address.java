public class Address {
    public String street;
    public int numOfHouse;
    public int numOfFlat;
    public Address(String street, int numOfHouse, int numOfFlat) {
        this.street = street;
        this.numOfHouse = numOfHouse;
        this.numOfFlat = numOfFlat;
    }
    public String getStreet() {
        return street;
    }
    public int getNumOfHouse(){
        return numOfHouse;
    }
    public int getNumOfFlat() {
        return numOfFlat;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Address) {
            Address obj1 = (Address) obj;
            return (obj1.street.equals(street) && obj1.numOfHouse == numOfHouse && obj1.numOfFlat == numOfFlat);
        }
        return false;
    }

}
