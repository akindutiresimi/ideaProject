package dairy;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private String name;
    private String password;
    private List <String> entries = new ArrayList<>() ;

    public Dairy(String name, String password) {
        this. name = name;
        this. password = password;
    }

    public String getName(){
        return name;
    }
    public boolean isEmpty(){
        return emptyDiary();
    }

    public boolean emptyDiary() {
        return entries.isEmpty();
    }

    public boolean validatePassword(String attempt) {
        return this.password.equals(attempt);
    }

    public void write(String journey) {
        entries.add(journey);
    }
    public List<String> entries() {
        return new ArrayList<>(entries);
    }

    public boolean remove(String Journey) {
        return entries.remove(Journey);
    }
}
