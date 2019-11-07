package za.co.wethinkcode.swingy.model.artifact;


public abstract class Artifact {

    protected String name;
    private int points;

    public Artifact(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (+" + points + ")";
    }
}
