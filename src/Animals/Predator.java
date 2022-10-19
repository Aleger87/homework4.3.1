package Animals;

import java.util.Objects;

public class Predator extends Mammal {
    private String typeFood;

    public Predator(String name, int year, String habitat, int speed, String typeFood) {
        super(name, year, habitat, speed);
        this.typeFood = typeFood;
    }

    public void hunting() {
        System.out.println(getName() +" охотятся на других животных");
    }

    public String getTypeFood() {
        return typeFood;
    }

    @Override
    public String toString() {
        return "Predators{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeFood, predator.typeFood);
    }


}
