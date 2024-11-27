public abstract class Bird extends Animal  {
    private int height;
    private String description;

    public Bird(String name,int age,int height, String description) {
        super(name, age);
        this.height = height;
        this.description = description;

    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + height + " " + description;
    }

}
