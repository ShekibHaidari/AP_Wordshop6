public class Parrot extends Bird implements Prey{

    public Parrot(String name, int age, int height, String description) {
        super(name, age, height, description);
    }

    @Override
    public void prey() {

    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String toString(){
        return "Parrot " + super.toString();
    }
}
