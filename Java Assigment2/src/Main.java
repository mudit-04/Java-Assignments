import java.util.HashSet;
import java.util.Set;

public class Main {

    private static boolean checkAlphabets(String str){
        Set<Character> hash = new HashSet<>();
        for(int i = 0; i<str.length(); i++){
            hash.add(str.charAt(i));
        }
        for(char x = 'a' ; x <= 'z'; x++){
            if(!hash.contains(x)) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String sample = "ABCdefghijklmnopqrstuvwxyzqwoijfs234234"; // true;
        //String sample = "AFCJHwerwenrsdns32"; //false
        System.out.println(checkAlphabets(sample.toLowerCase()));
    }

}
