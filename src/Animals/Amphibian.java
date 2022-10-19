package Animals;

public class Amphibian extends Animal {

    public Amphibian(String name, int year, String habitat) {
        super(name, year, habitat);
    }

    public void hunting() {
        System.out.println (getName() + " охотятся на мелких животных и насекомых");
    }

    @Override
    public void eat( String eat) {
        System.out.println(getName() + " "+eat );
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спят зимой");
    }

    @Override
    public void move() {
        System.out.println(getName() + " по земле и по воде");
    }
}
