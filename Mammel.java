public abstract class Mammel extends Animal {
    private int speed;
    private String description;
    public Mammel( String name, int age, int speed, String description) {
        super(name,age);
        this.speed = speed;
        this.description = description;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + speed + " " + description;
    }
}
