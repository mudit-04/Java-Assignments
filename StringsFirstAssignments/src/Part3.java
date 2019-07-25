import java.util.regex.Pattern;

public class Part3 {
    public boolean twoOccurrences(String A, String B){
        int firstOccurence = A.indexOf(B);
        if( firstOccurence != -1) {
            int secondOcccurence = A.indexOf(B, firstOccurence + B.length());
            if(secondOcccurence != -1) return true;
        }
        return false;
    }

    public void testTwoOccurrences(){
        String A = "A story by Abby Long";
        String pattern = "byy";
        boolean search = twoOccurrences(A,pattern);
        if(search) System.out.println("Pattern Found");
        else System.out.println("Pattern Not Found");
    }

    public String lastPart(String A, String B){
        int occurrence = A.indexOf(B);
        if(occurrence != -1) return A.substring(occurrence + B.length());
        else return B;
    }

    public void testLastPart(){
        String A = "banana";
        String B = "ana";
        System.out.println("The part of the string after " + B + " in " + A + " is " + lastPart(A,B));
    }

}
