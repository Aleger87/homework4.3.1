import Animals.*;


public class Main {
    public static void main(String[] args) {

        Herbivore gazelle = new Herbivore("Газель", 1, "Лес", 40, "траву");
        gazelle.eat( gazelle.getTypeFood());
        gazelle.walk();
        gazelle.sleep();
        gazelle.move();

        Herbivore giraffe = new Herbivore("Мелман", 5, "Савана", 40, "Листья деревьев");
        giraffe.eat(giraffe.getTypeFood());
        giraffe.sleep();
        giraffe.move();



        Herbivore horse = new Herbivore("Лошадь", 5, "Домашнее животное", 60, "Сено");
        horse.eat( horse.getTypeFood());
        horse.sleep();
        horse.move();

        Predator hyena = new Predator("Гиена", 5, "Савана", 30, "Мясо");
        hyena.eat(hyena.getTypeFood());
        hyena.sleep();
        hyena.move();

        Predator tiger = new Predator("Амуский тигр", 3, "Амурская область, Россия", 40, "Мясо");
        tiger.eat(tiger.getTypeFood());
        tiger.sleep();
        tiger.move();



        Predator bear = new Predator("Миша", 7, "Лес", 35, "Мёд");
        bear.eat(bear.getTypeFood());
        bear.sleep();
        bear.move();

        Amphibian frog = new Amphibian("Квакушка", 1, "Болото");
        frog.eat(" насекомых");
        frog.sleep();
        frog.move();

        Amphibian grassSnake = new Amphibian("Уж", 1, "Река");
        grassSnake.eat( " насекомых, мелких животных");
        grassSnake.sleep();
        grassSnake.move();

        NotFlying peacock = new NotFlying("Павлин", 3, "Домашнее животное", null);
        peacock.eat( " зерна, крупу");
        peacock.sleep();
        peacock.walk();

        NotFlying penguin = new NotFlying("Ковальски", 12, "Нью-Йорк", null);
        penguin.eat( " рыбу");
        penguin.sleep();
        penguin.walk();

        NotFlying dodoBird = new NotFlying("Додо", 3, "Мадагаскар", null);
        dodoBird.eat( " .. что-то ест..");
        dodoBird.sleep();
        dodoBird.walk();

        Flying seagull = new Flying("Чайка", 2, "Море", null);
        seagull.eat( " рыбу");
        seagull.sleep();
        seagull.move();


        Flying albatross = new Flying("Альбатрос", 3, "Море", null);
        albatross.eat( " рыбу");
        albatross.sleep();
        albatross.move();
        albatross.getHabitat();
        albatross.hunting();

        Flying falcon = new Flying("Сокол", 3, "Степь", null);
        falcon.eat( "мышей");
        falcon.sleep();
        falcon.move();

        Herbivore gaz= new Herbivore("Газель", 1, "Лес", 40, "траву");
        gaz.eat( gaz.getTypeFood());
        gaz.sleep();
        gaz.move();

        if (gazelle.equals(gaz)) {
            throw new RuntimeException(gaz.getName() + " -это животное уже есть в зоопарке" );
        }


    }


}