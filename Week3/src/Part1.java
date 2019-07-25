import edu.duke.*;
import org.apache.commons.csv.*;

public class Part1 {
    public String countryInfo( CSVParser parser, String Country){
        for(CSVRecord record : parser ){
            String colCountry = record.get(0);
            if(colCountry.equals(Country)){
                return Country + " : " +record.get(1)+ " : " + record.get(2);
            }
        }
        return "Not Found";
    }

    public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2){
        for(CSVRecord record : parser ) {
            String exportItem = record.get(1);
            int item1 = exportItem.indexOf(exportItem1);
            int item2 = exportItem.indexOf(exportItem2);
            if (item1 != -1 && item2 != -1) {
                System.out.println(record.get(0));
            }
        }
    }

    public int numberOfExporters(CSVParser parser, String exportItem){
        int count = 0;
        for(CSVRecord record : parser ) {
            String exportItems = record.get(1);
            int item = exportItems.indexOf(exportItem);
            if (item != -1 ) count++;
        }
        return count;
    }

    public void tester(){

        FileResource fr = new FileResource();
         CSVParser parser = fr.getCSVParser();
         System.out.println(countryInfo(parser,"Germany"));
         parser = fr.getCSVParser();
         listExportersTwoProducts(parser,"gold", "diamonds");
         parser = fr.getCSVParser();
         System.out.println("Number of country : " + numberOfExporters(parser,"gold"));

    }
}
