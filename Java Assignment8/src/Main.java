public class Main {
    public static void main(String[] args) {

        try{
            int n = 4;
            class1 c1 = new class1();
            c1.throwException(n);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }

    }
}
