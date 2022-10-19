package Animals;


import java.util.Objects;

public abstract class Animal {
    private String name;
    private int year;
    private String habitat;


    public Animal(String name, int year, String habitat) {
        setName(name);
        if (year < 0) {
            this.year = Math.abs(year);
        } else {
            this.year = year;
        }
        setHabitat(habitat);

    }

    public abstract void eat(String eat);

    public abstract void  sleep();

    public abstract void  move ();

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setName(String name) {
        if ("Animal".equals(getName()) || getName() == null){
            if (name == null || name.isEmpty() || name.isBlank()) {
                this.name = "Animal";
            }else{
                this.name = name;
            }
        }
    }




    public void setHabitat(String habitat) {
        if (getHabitat() == null || habitat.isEmpty() || habitat.isBlank()) {
            this.habitat = "Планета Земля";
        } else {
            this.habitat = habitat;
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return year == animal.year && Objects.equals(name, animal.name) && Objects.equals(habitat, animal.habitat);
    }
}
