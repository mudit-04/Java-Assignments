package factory;

public class Main {
    public static void main(String[] args) {
        FactoryClass fac = new FactoryClass();
        Cycle biCycle = fac.getObject("Bicycle");
        Cycle triCycle = fac.getObject("Tricycle");
        Cycle uniCycle = fac.getObject("Unicycle");
    }
}
