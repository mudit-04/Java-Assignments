public class Main {
    public static void main(String[] args) {
        Rodent [] obj = new Rodent[3];
        obj[0] = new Mouse();
        obj[1] = new Hamster();
        obj[2] = new Gerbil();
        for(int i = 0; i < 3; i++){
            //System.out.println();
            obj[i].commonMethod();
        }
    }
}
