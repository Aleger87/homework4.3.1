package Animals;

import java.util.Objects;

public class Flying extends Bird {
    private String typeMovement;

    public Flying(String name, int year, String habitat, String typeMovement) {
        super(name, year, habitat);
        this.typeMovement = typeMovement;
    }

    public void fly() {
        System.out.println(getName() + " летает по небу");
    }

    public String getTypeMovement() {
        return typeMovement;
    }


    @Override
    public String toString() {
        return "Flying{" +
                "typeMovement='" + typeMovement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeMovement, flying.typeMovement);
    }

}
