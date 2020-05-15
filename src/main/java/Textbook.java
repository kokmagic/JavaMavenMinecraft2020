import java.util.*;

public class Textbook {
    public Map<String, Address> all = new HashMap<>();
    public Map<String, Address> getAll() {
        return new HashMap<>(all);
    }
    public boolean addHuman(String name, Address address) {
        if (all.containsKey(name)) return false;
        else all.put(name, address);
        return true;
    }
    public boolean deleteHuman(String name) {
        if (all.containsKey(name)) {
            all.remove(name);
            return true;
        } else return false;
    }
    public boolean changeAddress(String name, Address address) {
        if (all.containsKey(name) && !address.equals(all.get(name))) {
            all.put(name, address);
            return true;
        } else return false;
    }
    public Address getAddress(String name) {
        return all.get(name);
    }
    public ArrayList<String> findPersons(String street) {
        ArrayList<String> listOfPersons = new ArrayList<>();
        for (Map.Entry<String, Address> entry: all.entrySet()) {
            if (entry.getValue().getStreet().equals(street))
                listOfPersons.add(entry.getKey());
        }
        return listOfPersons;
    }
    public ArrayList<String> findPersons(String street, int house) {
        ArrayList<String> listOfPersons = new ArrayList<>();
        for (Map.Entry<String, Address> entry: all.entrySet()) {
            if (entry.getValue().getStreet().equals(street) && entry.getValue().getNumOfHouse() == house)
                listOfPersons.add(entry.getKey());
        }
        return listOfPersons;
    }

}
