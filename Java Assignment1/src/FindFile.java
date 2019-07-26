import java.io.File;
import java.util.Scanner;

public class FindFile {

    // Recursively calling for each directory t search the file.
    public static void findFile(String s, File file){
        File[] list = file.listFiles();
        if(list!=null){
            for (File fil : list){
                if (fil.isDirectory()) {
                    findFile(s,fil);
                }
                else if (s.equalsIgnoreCase(fil.getName())) {
                    System.out.println(fil.getParentFile() +"/" + s);

                }
            }
        }

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name to be searched or enter exit to quit" );
        String name = scan.next();
        while(!name.equals("exit")){
            String directory = "/home"; // Directory where to search
            findFile(name,new File(directory));
            System.out.println("Enter the file name to be searched or enter exit to quit" );
            name = scan.next();
        }
    }
}
