package dairy;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries = new ArrayList<>() ;

    public Dairy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked = true;
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

    public void createEntry(int id, String title, String body) {
        entries.add(new Entry(id, title, body));
    }

    public List<Entry> entries() {
        return new ArrayList<>(entries);
    }

    public boolean deleteEntry(int id) {
        return entries.removeIf(entry -> entry.getId() == id);
    }


    public Entry entryById(int id) {
        for(Entry myEntry: entries){
            if(myEntry.getId() == id) {
                return myEntry;
            }
        }
        throw new IllegalArgumentException("Invalid");
    }

}
