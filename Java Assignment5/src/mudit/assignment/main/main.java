package mudit.assignment.main;
import mudit.assignment.data.class1;
import mudit.assignment.singleton.class2;

public class main {

    public static void createObject(){
        class2 c2 = new class2();
        c2.printString();
    }

    public static void main(String[] args) {
        class1 c1 = new class1();
        c1.printVar();
        c1.printLocalvar();
    }

}
