import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void ping(ArrayList<String> command) throws IOException {
        ProcessBuilder build = new ProcessBuilder(command);
        Process process = build.start();
        int noOfPings = 20;
        BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String s;
        ArrayList<Double> timeForEachPing = new ArrayList<>();
        int count = 0;
        while((s = input.readLine()) != null  && count++ < noOfPings)
        {
            System.out.println(s);
            Double timeToPing = getTimeForPing(s);
            if(timeToPing != 0) timeForEachPing.add(timeToPing);
        }
        process.destroy();
        Double median = getMedian(timeForEachPing);
        System.out.println("Median " +median);

    }

    private static Double getTimeForPing(String s) {

        int start = s.indexOf("time=");
        if(start == -1) return 0.0;
        int end = s.indexOf("ms", start);
        if(end == -1) return 0.0;
        return Double.parseDouble(s.substring(start + 5, end));

    }

    private static double getMedian(ArrayList<Double> list){
        Collections.sort(list);
        int size = list.size();
        if(((size % 2) != 0) ) return list.get(size / 2);
        else return (list.get(size / 2 - 1) + list.get(size / 2)) / 2;
    }

    public static void main(String[] args) throws IOException {

        ArrayList<String> command = new ArrayList<>();
        command.add("ping");
        command.add("www.youtube.com");
        ping(command);
    }
}