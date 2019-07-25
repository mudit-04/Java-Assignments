public class Main {
    public static void main(String[] args) {
        Regex r = new Regex();
        //String str = "Asadasdas1341."; // true;
        String str = "asadasd.";  //false;
        System.out.println(r.patternMatching(str));
    }
}
