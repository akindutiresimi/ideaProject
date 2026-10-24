package dairy;

import java.util.ArrayList;
import java.util.List;

public class Dairies {
    private List<Dairy>dairies = new ArrayList<>();

    public void add(String username, String password) {
        Dairy myDairy = new Dairy(username, password);
        dairies.add(myDairy);
    }

    public Dairy findByUsername(String username) {
        for(Dairy myDairy : dairies) {
            if (myDairy.getUsername() == username) {
                return myDairy;
            }
        }
            return null;
    }

    public void delete(String username, String password) {
        for (Dairy mydairy : dairies) {
            if(mydairy.getUsername() == username && mydairy.unLocked(password)){
                dairies.remove(mydairy);
            }
        }
    }
}
