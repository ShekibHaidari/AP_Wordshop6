
public class Girafa extends Mammel implements Prey  {

    public Girafa(String name, int age, int speed, String description) {
        super(name, age, speed, description);
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
        return "Girafa" + super.toString();
    }
}
