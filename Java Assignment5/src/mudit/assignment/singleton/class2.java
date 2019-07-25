package mudit.assignment.singleton;

public class class2 {
    public  String s;

    public static void initializeVariable(String str){
        //this.s = str;
        // Static method can't use instance variable.
    }

    public void printString(){
        System.out.println(this.s);
    }
}
