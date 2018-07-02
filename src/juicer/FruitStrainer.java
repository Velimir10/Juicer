package juicer;

// Cediljka za voce
import java.util.List;

public class FruitStrainer {

    private Bowl bowl;
    private double juice;

    public FruitStrainer() {
        juice = 0;
        bowl = Bowl.getInstance();
    }

    public void extract() {
      
        List<Fruit> lista = bowl.getFruits();
        for (Fruit f : lista) {
            juice += f.getWeight() * 0.4;
        }
        System.out.println("Dobijeno " + juice + "L soka");

    }
    
    public double getJuiceInfo(){
        return juice;
    }
   

}
