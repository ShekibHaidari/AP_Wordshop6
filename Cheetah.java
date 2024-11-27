public class Cheetah extends Mammel implements Hunter{
    public Cheetah(String name, int age, int speed, String description) {
        super(name, age, speed, description);
    }

    @Override
    public void hunt(Animal animal) {
        System.out.println(this.name + "Hunteted " + animal.name);
    }

    @Override
    public String toString() {
        return "Cheetah{" + super.toString() + "}";
    }
}
