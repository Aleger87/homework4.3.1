package Animals;

import java.util.Objects;

public class NotFlying extends Bird {
    private String typeMovement;

    public NotFlying(String name, int year, String habitat, String typeMovement) {
        super(name, year, habitat);
        this.typeMovement = typeMovement;
    }

    public void walk() {
        System.out.println(getName() + " не умеют летать, ходят по земле");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    @Override
    public String toString() {
        return "NotFlying{" +
                "typeMovement='" + typeMovement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NotFlying notFlying = (NotFlying) o;
        return Objects.equals(typeMovement, notFlying.typeMovement);
    }

}
