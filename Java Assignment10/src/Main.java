public class Main {
    public static void main(String[] args) {
        SList<String> item1 = new SList<>();
        SList<String> item2 = new SList<>();
        SList<String> item3 = new SList<>();
        item2.data = "world";
        item1.data = "hello";
        item3.data = "Howdy";
        item1.next = item2;
        item2.next = item3;

        SList<String> iterator;
        iterator = item1;
        while(iterator != null){
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}
