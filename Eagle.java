public class Eagle extends Bird implements Hunter {
    public Eagle(String name, int age, int height, String description) {
        super(name, age, height, description);
    }

    @Override
    public void hunt(Animal animal) {
        System.out.println(this.name + "Hunted " + animal.name);
    }
    @Override
    public String toString() {
        String s = super.toString();
        return s;
    }
}
