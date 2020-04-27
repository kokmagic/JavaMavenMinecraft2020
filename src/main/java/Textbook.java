import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Textbook {
    public Map<String, Adress> all = new HashMap<String, Adress>();
    public Map<String, Adress> getAll() {
        return new HashMap<String, Adress>(all);
    }
    public boolean addHuman(String name, Adress Adress) {
        if (all.containsKey(name)) return false;
        else all.put(name, Adress);
        return true;
    }
    public boolean deleteHuman(String name) {
        if (all.containsKey(name)) {
            all.remove(name);
            return true;
        } else return false;
    }
    public boolean changeAdress(String name, Adress Adress) {
        if (all.containsKey(name) && Adress != all.get(name)) {
            all.put(name, Adress);
            return true;
        } else return false;
    }
    public void getAdress(String name) {
        all.get(name);
    }
    public Set<String> findPersons(String Street) {
        Set<String> list = new HashSet<String>();
        for (Map.Entry<String, Adress> entry: all.entrySet()) {
            if (entry.getValue().getStreet().equals(Street))
                list.add(entry.getKey());
        }
        return list;
    }
    public Set<String> findPersons(String Street, int house) {
        Set<String> list = new HashSet<String>();
        for (Map.Entry<String, Adress> entry: all.entrySet()) {
            if (entry.getValue().getStreet().equals(Street) && entry.getValue().getNumOfHouse() == house)
                list.add(entry.getKey());
        }
        return list;
    }

}
