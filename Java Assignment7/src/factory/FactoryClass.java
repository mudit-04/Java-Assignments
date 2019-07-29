package factory;

public class FactoryClass {
    public Cycle getObject(String obj){
        if(obj.equals("Bicycle")) return new Bicycle();
        else if(obj.equals("Tricycle")) return new Tricycle();
        else return new Unicycle();
    }
}
