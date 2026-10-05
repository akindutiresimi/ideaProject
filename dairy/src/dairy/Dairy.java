package dairy;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private String username;
    private String password;
    private boolean isLocked;
    private List <String> entries = new ArrayList<>() ;

    public Dairy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean unLocked(String password ) {
        return validatePassword(password);
    }

    public void lockDairy() {
        isLocked = true;
    }

    public String getUsername(){
        return username;
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

    public void createEntry(String journey) {
        entries.add(journey);
    }
    public List<String> entries() {
        return new ArrayList<>(entries);
    }

    public boolean remove(String Journey) {
        return entries.remove(Journey);
    }

    
}
