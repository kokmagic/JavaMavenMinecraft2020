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
}
