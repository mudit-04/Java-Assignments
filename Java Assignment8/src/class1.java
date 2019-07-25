public class class1 {
    public void throwException(int n){
        if(n == 0) throw new ArithmeticException();
        else if(n == 1) throw new AssertionError();
        else throw new NullPointerException();
    }
}
