package problem;

public class Problem {
    private String name;
    private String description;
    private String problemType;
    private boolean isSolve;

    Problem() {}


    public Problem(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
