import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Part4 {

    public void getYoutubeLinks() {
        String connectionString = "http://www.dukelearntoprogram.com/course2/data/manylinks.html";
        try {
            URL url = new URL(connectionString);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            ArrayList<String> links = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                String temp = getLink(line);
                if(temp != null) {
                    links.add(temp);
                    System.out.println(temp);
                }
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getLink(String line){
        String link = "youtube.com";
        int occurrence = line.indexOf(link);
        if(occurrence != -1){
            int firstOccurrence = line.lastIndexOf("\"");
            int lastOccurrence = line.lastIndexOf("\"");
            if(firstOccurrence != -1 && lastOccurrence != -1)
                return line.substring(firstOccurrence+1,lastOccurrence);
        }
        return null;
    }
}
