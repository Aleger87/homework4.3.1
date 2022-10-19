package Animals;

public abstract class Bird extends Animal {
    public Bird(String name, int year, String habitat) {
        super(name, year, habitat);
    }

    public void hunting() {
        System.out.println(getName() + " охотится на рыб, мелких животных, рыб" );
    }

    @Override
    public void eat( String eat) {
        System.out.println(getName() + " ест " + eat);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " практически не спят");
    }

    @Override
    public void move() {
        System.out.println(getName()+ " по небу");
    }
}
