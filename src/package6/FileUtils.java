package package6;

import java.io.*;
import java.util.Properties;

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


    public static Properties readFromPropertiesFile() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream("src/package6/data/information.properties");
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static void main(String[] args) {
        String data = readFromTextFile();
        System.out.println(data);

       /* String names ="";
        String name ="Akash";
        names=name+" first time inserted";
        names=names+"\n"+name+" second time inserted";
        System.out.println(names);*/

        Properties properties = readFromPropertiesFile();
        System.out.println(properties.getProperty("year"));
        System.out.println(properties.getProperty("month"));
        System.out.println(properties.getProperty("day"));


        // classwork --- homework

        // create a arraylist & store these keys in a arraylist (year,month,day)
        // read from the arraylist ,
        // search from the properties.getProperty(arraylist.get(0))'
        // key -- arraylist.get(0)
        // value -- properties.getProperty(arraylist.get(0))
        // store the key and the value in a hashmap and print from the hashmap
    }

}
