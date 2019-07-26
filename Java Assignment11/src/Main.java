import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static void printInFile(Map<Character,Integer> hash) throws FileNotFoundException {
        File file = new File("out.txt");
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        System.setOut(ps);

        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            if((int)entry.getKey() != 10){
                System.out.println("Value = " + entry.getKey() + " , Occurrence  = " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(args[0]);
        Map<Character,Integer> hash = new HashMap();

        int reader;
        while ((reader = fr.read()) != -1) {
            char ch = (char) reader;
            Integer value = hash.get(ch);
            if(value == null) value = 0;
            hash.put(ch,value+1);
        }
        printInFile(hash);
    }
}
