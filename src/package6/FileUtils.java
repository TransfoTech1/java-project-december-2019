package package6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

    public static String readFromTextFile() {
        String dataFromFile = "";
        String container;
        try {
            FileReader fileReader = new FileReader("src/package6/data/example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((container = bufferedReader.readLine()) != null) {
                dataFromFile = dataFromFile + "\n" + container;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataFromFile;
    }


    public static void main(String[] args) {
        String data = readFromTextFile();
        System.out.println(data);

       /* String names ="";
        String name ="Akash";
        names=name+" first time inserted";
        names=names+"\n"+name+" second time inserted";
        System.out.println(names);*/

    }


}
