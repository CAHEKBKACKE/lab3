package Abstract;

public abstract class Character {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.getName();
    }
}