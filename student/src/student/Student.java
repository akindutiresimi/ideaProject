package student;

public class Student {
    private String name;
    private int gradeLevel;


    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String introduction() {
        return "my name is " + name +"," +  "my grade level is "  + gradeLevel;
    }

    public int promotion() {
        return gradeLevel + 1;
    }

    public boolean has_Passed(int Score) {
        if(Score > 60) {
            return true;
        }
        return false;
    }

    public String update_Name(String name) {
        return this.name = name;
    }

    public boolean is_Graduating(int gradeLevel) {
        if(gradeLevel == 12){
            return true;
        }
        return false;
    }
}
