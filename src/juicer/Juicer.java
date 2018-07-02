package juicer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Juicer {

    private Bowl bowl;
    private FruitStrainer fruitStrainer;
    private double capacity;
    private int actions;

    public Juicer() {
        this.bowl = Bowl.getInstance();
        this.fruitStrainer = new FruitStrainer();
        this.capacity = 30;
        this.actions = 100;
    }

    public void addFruit(Apple apple) throws PremasenKapacitetException {

        if (apple.getWeight() > capacity) {
            throw new PremasenKapacitetException("Premasen kapacitet");
        }
        if (actions <= 0) {
            System.out.println("Ispunjen broj akcija");
            return;
        }
        if (apple.isCrumbly()) {
            System.out.println("Jabuka je crvljiva, ne moze se dodati!");

        } else {
            bowl.addFruit(apple);
            capacity -= apple.getWeight();
            actions--;
        }

    }

    public void extract() {
         if (actions <= 0) {
            System.out.println("Ispunjen broj akcija");
            return;
        }
        fruitStrainer.extract();
        actions--;
    }

    public static void main(String[] args) {

        Juicer j = new Juicer();
        try {

            j.addFruit(new Apple("Crvena javuka", 10));
            j.addFruit(new Apple("Crvena javuka", 10));
            j.addFruit(new Apple("Crvena javuka", 10));
            j.addFruit(new Apple("Crvena javuka", 5.50));

        } catch (PremasenKapacitetException ex) {
            ex.printStackTrace();

        } finally {
            j.extract();
        }
    }

}
