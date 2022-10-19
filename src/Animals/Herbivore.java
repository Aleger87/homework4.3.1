package Animals;


import java.util.Objects;

public class Herbivore extends Mammal {
    private String typeFood;



    public Herbivore(String name, int year, String habitat, int speed, String typeFood) {
        super(name, year, habitat, speed);
        this.typeFood = typeFood;
    }

    public void graze() {
        System.out.println(getName()+ " пасутся на лугах");
    }

    public String getTypeFood() {
        return typeFood;
    }

    @Override
    public String toString() {
        return "Herbivorous{" +
                "typeFood='" + typeFood + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeFood, herbivore.typeFood);
    }


}
