public class Adress {
    public String Street;
    public int NumOfHouse;
    public int NumOfFlat;
    public Adress(String Street, int NumOfHouse, int NumOfFlat) {
        this.Street = Street;
        this.NumOfHouse = NumOfHouse;
        this.NumOfFlat = NumOfFlat;
    }
    public String getStreet() {
        return Street;
    }
    public int getNumOfHouse(){
        return NumOfHouse;
    }
    public int getNumOfFlat() {
        return NumOfFlat;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Adress) {
            Adress obj1 = (Adress) obj;
            return (obj1.Street.equals(Street) && obj1.NumOfHouse == NumOfHouse && obj1.NumOfFlat == NumOfFlat);
        }
        return false;
    }

}
