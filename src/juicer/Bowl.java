package juicer;

import java.util.ArrayList;
import java.util.List;

public class Bowl {

    
    private List<Fruit> list;
    private static Bowl bowl;
    
    

    private Bowl() {
       
        this.list = new ArrayList<>();
    }
    
    public synchronized static Bowl getInstance(){
        if(bowl == null){
            bowl = new Bowl();
           
        }
        return bowl;
    }

   
    public void addFruit(Fruit fruit) {
        list.add(fruit);
        System.out.println("Dodata vocka");
    }
 
    public int howManyFruits(){
        return list.size();
    }
    
    
    
    public List<Fruit> getFruits(){
        return list;
    }

   
    
    
}
