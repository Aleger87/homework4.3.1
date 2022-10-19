package Animals;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private int speed;
    public Mammal(String name, int year, String habitat, int speed) {
        super(name, year, habitat);
        this.speed = speed;
    }

    public void walk() {
        System.out.println(getName() + " гуляет " + getHabitat());
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void eat(String eat) {
        System.out.println(getName() + " ест " + eat);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спят по ночам");
    }

    @Override
    public void move() {
        System.out.println(getName() + " по земле");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed;
    }

}
