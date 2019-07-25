package mudit.assignment.data;
 public class class1 {
    private int intVar;
    private char charVar;

    public void printVar(){
        System.out.println(this.intVar + " " + this.charVar);
    }
    public void printLocalvar(){
        int localVar1; // There is no default value for local variables.
        char locaVar2; // local value should be initialized before use.
        //System.out.println(localVar1 + " " + locaVar2);
    }
}
