import java.io.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Record> Records;

    public static void main(String[] args) {
        try {

//            File file = new File("hello.txt");
//            file.createNewFile();
//            FileWriter writer = new FileWriter(file);
//            writer.write("This\n is \n a \n demo \n");
//            writer.flush();
//            writer.close();

            //Read data from file and parse into Record
            BufferedReader br =
                    new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            Records = new ArrayList<Record>();

            while (line != null) {

                String[] itemsStr = line.split(" ");
                int length = itemsStr.length;
                Records.add(new Record(new Person(itemsStr[0]), new Person(itemsStr[1]), Integer.parseInt(itemsStr[2]),
                        Integer.parseInt(itemsStr[3]), Integer.parseInt(itemsStr[4])));
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.print(e);
        }

    }
}
