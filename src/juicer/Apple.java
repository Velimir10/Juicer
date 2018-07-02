
package juicer;

import java.util.Random;


public class Apple extends Fruit{
    
    private boolean crumbly;
    
    public Apple(String name, double weight) {
        super(name, weight);
        setCrumbly();
    }
    
    private void setCrumbly(){
        crumbly = false;
        int i = new Random().nextInt(5);
        if(i == 4)
            crumbly = true;
    }

    public boolean isCrumbly() {
        return crumbly;
    }
    
    
    
    
    
}
